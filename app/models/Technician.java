package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model;

/**
 * @author timhdavis
 * @since 10/22/2016
 */
 
@Entity
public class Technician extends Model
{
    @Id
    public Long id;
    
    public String firstName;
    public String lastName;
    
    public String email;
    public int tier;
    
}