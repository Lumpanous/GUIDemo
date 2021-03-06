
package guidemo;

import java.time.LocalDate;
import java.time.Period;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.image.Image;

/**
 *
 * Use Property objects to make the table updatable.  Property has built
 * in Listeners
 */
public class Person {
    
    private SimpleStringProperty firstName, lastName;
    private LocalDate birthday;
    private Image photo;

    
    
    // Constructor 
    //accepts Strings, and converts to Properties
    
    public Person(String firstName, String lastName, LocalDate birthday) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.birthday = birthday;
        photo = new Image("/images/default.png");
    }

    
    //Constructor with photo
    
    
    public Person(String firstName, String lastName, LocalDate birthday, Image photo){
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.birthday = birthday;
        this.photo = photo;
    }

    //Getters and Setters
    public String getFirstName() {
        return firstName.get();
    }

   
    public void setFirstName(String firstName) {
        this.firstName = new SimpleStringProperty(firstName);
    }

    public String getLastName() {
        return lastName.get();
    }
    

   
    
    public void setLastName(String lastName) {
        this.lastName= new SimpleStringProperty(lastName);
    }
    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    
    public int getAge(){
        
        //returns the amount of years between birthday and current date
        return Period.between(birthday, LocalDate.now()).getYears();
    }

    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }
    
}
