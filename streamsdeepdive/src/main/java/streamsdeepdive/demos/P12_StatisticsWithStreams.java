package streamsdeepdive.demos;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;

import streamsdeepdive.dataclasses.Car;
import streamsdeepdive.dataclasses.GenerateData;

public class P12_StatisticsWithStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		countDemo();
		
		minDemo();
		
		maxDemo();
		
		averageDemo();
		
		sumDemo();
		
		statisticsDemo();
	}

	public static void countDemo() {
		List<Car> cars = GenerateData.getCars();
		
		Predicate<Car> hondaCar = car -> car.getMake().equalsIgnoreCase("honda");
		
		Predicate<Car> carManufacturedAfter2020 = car -> car.getYear() > 2020;
		
		long count = cars.stream()
				.filter(hondaCar)
				.filter(carManufacturedAfter2020)
				.count();
		
		System.out.println("Honda cars manufactured after 2020: " + count);
				
	}
	
	public static void minDemo() {
		List<Car> cars = GenerateData.getCars();
		
		double minPrice = cars.stream()
				.mapToDouble(Car::getPrice)
				.min()
				.orElse(0);
		
		System.out.println("Mininum price: " + minPrice);
	}
	
	public static void maxDemo() {
		List<Car> cars = GenerateData.getCars();
		
		double maxPrice = cars.stream()
				.mapToDouble(Car::getPrice)
				.max()
				.orElse(0);
		
		System.out.println("Maximum price: " + maxPrice);
	}
	
	public static void averageDemo() {
		List<Car> cars = GenerateData.getCars();
		
		double averagePrice = cars.stream()
				.mapToDouble(Car::getPrice)
				.average()
				.orElse(0);
		
		System.out.println("Average price: " + averagePrice);
	}
	
	public static void sumDemo() {
		List<Car> car = GenerateData.getCars();
		
		double sumOfPrices = car.stream()
				.mapToDouble(Car::getPrice)
				.sum();
		
		System.out.println("Sum of prices: " + sumOfPrices);
	}
	
	public static void statisticsDemo() {
		List<Car> cars = GenerateData.getCars();
		
		DoubleSummaryStatistics statistics = cars.stream()
				.mapToDouble(Car::getPrice)
				.summaryStatistics();
		
		System.out.println("Count from statistics: " + statistics.getCount());
		System.out.println("Minimum from statistics: " + statistics.getMin());
		System.out.println("Maximum from statistics: " + statistics.getMax());
		System.out.println("Average from statistics: " + statistics.getAverage());
		System.out.println("Sum from statistics: " + statistics.getSum());
	}
}
