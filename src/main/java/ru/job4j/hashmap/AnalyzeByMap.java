package ru.job4j.hashmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int sum = 0;
        int count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.getSubjects()) {
                sum += subject.getScore();
                count++;
            }
        }
        return count == 0 ? 0D : (double) sum / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        int sum = 0;
        int count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.getSubjects()) {
                sum += subject.getScore();
                count++;
            }
            double average = count == 0 ? 0D : (double) sum / count;
            labels.add(new Label(pupil.getName(), average));
        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> subjectScores = new LinkedHashMap<>();
        Map<String, Integer> subjectCounts = new LinkedHashMap<>();

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.getSubjects()) {
                String subjectName = subject.getName();
                int score = subject.getScore();
                subjectScores.put(subjectName, subjectScores.getOrDefault(subjectName, 0) + score);
                subjectCounts.put(subjectName, subjectCounts.getOrDefault(subjectName, 0) + 1);
            }
        }
        List<Label> labels = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : subjectScores.entrySet()) {
            String subjectName = entry.getKey();
            int totalScore = entry.getValue();
            int totalCount = subjectCounts.get(subjectName);
            double averageScore = (double) totalScore / totalCount;
            labels.add(new Label(subjectName, averageScore));
        }
        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        int sum = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.getSubjects()) {
                sum += subject.getScore();
            }
            labels.add(new Label(pupil.getName(), sum));
            sum = 0;
        }
        Collections.sort(labels);
        return labels.isEmpty() ? null : labels.get(labels.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> subjectScores = new LinkedHashMap<>();

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.getSubjects()) {
                String subjectName = subject.getName();
                int score = subject.getScore();
                subjectScores.put(subjectName, subjectScores.getOrDefault(subjectName, 0) + score);
            }
        }

        String bestSubject = null;
        int maxScore = 0;
        for (Map.Entry<String, Integer> entry : subjectScores.entrySet()) {
            if (entry.getValue() > maxScore) {
                maxScore = entry.getValue();
                bestSubject = entry.getKey();
            }
        }

        return bestSubject == null ? null : new Label(bestSubject, maxScore);
    }
}
