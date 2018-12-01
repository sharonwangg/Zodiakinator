package com.example.sharonwang.zodiakinator;

public class Questions {
    public String questions[] = {
            "What is your greatest strength?",
            "What is your greatest weakness?",
            "What part of your body is your favorite?",
            "Pick something you enjoy.",
            "What's your favorite season?",
            "What's your favorite color?",
            "Which of these do you hate the most?",
            "Pick an element.",
            "Choose a female celebrity.",
            "Choose a male celebrity."
    };

    private String choices[][] = {
            {"Ambitious", "Dependable", "Curious", "Loyal", "Bold", "Organized", "Social", "Passionate", "Honest",
            "Hardworking", "Independent", "Imaginative"},
            {"Impatient", "Stubborn", "Indecisive", "Pessimistic", "Arrogant", "Critical", "Vain", "Jealous", "Argumentative",
            "Selfish", "Rebellious", "Sensitive"},
            {"Face", "Jawline", "Hands", "Chest", "Heart", "Waist", "Butt", "Hips", "Legs", "Skin", "Ankles", "Feet"},
            {"New Clothes", "Photography", "Books", "Sports", "Movies", "Concerts", "Jewelry", "Spicy Food", "Animals", "Motorcycles", "Teaching", "The Beach"},
            {"Winter", "Spring", "Summer", "Fall"},
            {"Red", "Pink", "Yellow", "Purple", "Gold", "Silver", "Blue", "Black", "Light Blue", "Dark Blue", "Turquoise", "Sea-Green"},
            {"Delays", "Sudden Changes", "Being Alone", "Strangers", "Being Ignored", "Rudeness", "Injustice", "Dishonesty", "Clingy People", "Everything", "Broken Promises", "Criticism"},
            {"Fire", "Earth", "Air", "Water"},
            {"Emma Watson", "Adele", "Natalie Portman", "Ariana Grande", "Jennifer Lawrence", "Beyonce", "Kim Kardashian", "Kris Jenner", "Nicki Minaj", "Michelle Obama", "Ellen Degeneres", "Rihanna"},
            {"Robert Downey Jr.", "Dwayne Johnson", "Kendrick Lamar", "Post Malone", "Shawn Mendes", "Dylan O'Brien", "Zac Efron", "Drake", "Brad Pitt", "Zayn Malik", "Harry Styles", "Justin Bieber"}
    };

    public String getQuestion(int question) {
        return questions[question];
    }

    public String getChoice(int question, int choiceNum) {
        return choices[question][choiceNum];
    }
}
