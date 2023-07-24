package player;

import team.Team;

public class Player {
    
    private String name;
    private int age;
    private int strength;
    private char position;
    private double salary;
    private double value;
    private int goals;
    private int assists;
    private float grade;
    private boolean star;
    private Team team;
    
    public Player(
            String name, 
            int age, 
            int strength, 
            char position,
            double salary,
            double value,
            int goals,
            int assists,
            float grade,
            boolean star,
            Team team
        ){
        this.name = name;
        this.age = age;
        this.strength = strength;
        this.position = position;
        this.salary = salary;
        this.value = value;
        this.goals = goals;
        this.assists = assists;
        this.grade = grade;
        this.star = star;
        this.team = team;
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public char getPosition() {
        return position;
    }

    public void setPosition(char position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
    
    public boolean getStar(){
        return this.star;
    }
    
    public void setStar(boolean star){
        this.star = star;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
