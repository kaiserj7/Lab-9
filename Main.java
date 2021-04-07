import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    
    ArrayList<Person> people = new ArrayList<Person>(); 
    Person p0 = new Person("Jake", 20, "Blue");
    Person p1 = new Person("A", 87, "Pink");
    Person p2 = new Person("B", 13, "Yellow");
    Person p3 = new Person("C", 55, "Black");
    Person p4 = new Person("D", 4, "Green");
    people.add(p0);  people.add(p1);
    people.add(p2);  people.add(p3);
    people.add(p4);  

    try{
      FileWriter fW = new FileWriter("data.txt");
      BufferedWriter output = new BufferedWriter(fW);

      for(int i = 0; i < people.size();i++){
        people.get(i).getAge();
        people.get(i).getColor();
        output.write(people.get(i).getName());
        output.newLine();
        output.write(Integer.toString(people.get(i).getAge()));
        output.newLine();
        output.write(people.get(i).getColor());
        output.newLine();
        output.flush();
      }
      output.close();
    }catch(IOException e){
      System.out.println("An error occurred: " + e);
    }

    try{
      FileReader fR = new FileReader("data.txt");
      BufferedReader reader = new BufferedReader(fR);

      while(reader.ready()){
        String name = reader.readLine();
        String age = reader.readLine();
        String color = reader.readLine();
        System.out.printf("%-10s %-10s %-10s %n",name, age, color);
      }

      reader.close();
    }catch(IOException e){
      System.out.println("An error occurred: " + e);
    }

    



  }
}