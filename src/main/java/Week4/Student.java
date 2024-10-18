package Week4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
	private String name;
	private List<Double> scores;

	public Student(String name, List<Double> scores) {
		this.name = name;
		this.scores = scores;
	}

	public String getName() {
		return name;
	}

	public List<Double> getScores() {
		return scores;
	}
}

class StudentScoreCalculator {
	public Map<String, Double> calculateAverageScores(List<Student> students) {
		Map<String, Double> averageScores = new HashMap<>();
		for (Student student : students) {
			String name = student.getName();
			List<Double> scores = student.getScores();
			double sum = 0;
			for (Double score : scores) {
				sum += score;
			}
			double average = scores.size() > 0 ? sum / scores.size() : 0;
			averageScores.put(name, average);
		}
		return averageScores;
	}
}