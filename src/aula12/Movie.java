package aula12;

public class Movie {
    
    String name, gender, rating;
    double score;
    int time;

    public Movie(String name, double score, String rating, String gender, int time){
        this.name = name;
        this.score = score;
        this.rating = rating;
        this.gender = gender;
        this.time = time;
    }

    public String getName(){
        return this.name;
    }

    public double getScore(){
        return this.score;
    }

    public String getRating(){
        return this.rating;
    }

    public String getGender(){
        return this.gender;
    }

    public int getTime(){
        return this.time;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setScore(double score){
        this.score = score;
    }

    public void setRating(String rating){
        this.rating = rating;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setTime(int time){
        this.time = time;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + ", Rating: " + this.rating + ", Gender: " + this.gender + ", Score: " + this.score + ", Time: " + this.time;
    }
}
