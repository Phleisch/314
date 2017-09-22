/*  Student information for assignment:
*
*  On my honor, <NAME>, this programming assignment is my own work
*  and I have not provided this code to any other student.
*
*  UTEID:
*  email address:
*  Grader name:
*  Number of slip days I am using:
*/

import java.util.ArrayList;

/**
* A collection of NameRecords. 
* Stores NameRecord objects and provides methods to select
* NameRecords based on various criteria.
*/
public class Names {

   /**
    * Returns an ArrayList of NameRecord objects that contain a 
    * given substring, ignoring case.  The names must be in sorted order based 
    * on name.
    * @param partialName != null, partialName.length() > 0
    * @return an ArrayList of NameRecords whose names contains
    * partialName. If there are no NameRecords that meet this
    * criteria returns an empty list. 
    */
   
   public ArrayList<NameRecord> getMatches(String partialName) {
       
   }

   /**
    * Returns an ArrayList of Strings of names that have been ranked in the
    * top 1000 or better for every decade. The Strings  must be in sorted 
    * order based on name. 
    * @return A list of the names that have been ranked in the top
    * 1000 or better in every decade. The list is in sorted ascending
    * order. If there are no NameRecords that meet this
    * criteria returns an empty list.
    */
   
   public ArrayList<String> rankedEveryDecade() {
       
   }

   /**
    * Returns an ArrayList of Strings of names that have been ranked in the 
    * top 1000 or better in exactly one decade. The Strings must be in sorted 
    * order based on name. 
    * @return A list of the names that have been ranked in the top
    * 1000 or better in exactly one decade. The list is in sorted ascending
    * order. If there are no NameRecords that meet this
    * criteria returns an empty list.
    */
   public ArrayList<String> rankedOnlyOneDecade() {
       
   }

   /**
    * Returns an ArrayList of Strings of names that have been getting more
    * popular every decade. The Strings  must be in sorted order based on name.
    * @return A list of the names that have been getting more popular in
    * every decade. The list is in sorted ascending
    * order. If there are no NameRecords that meet this
    * criteria returns an empty list. 
    */
   public ArrayList<String> alwaysMorePopular() {
       
   }

   /**
    * Returns an ArrayList of Strings of names that have been getting less
    * popular every decade. The Strings  must be in sorted order based on name.
    * @return A list of the names that have been getting less popular in
    * every decade. The list is in sorted ascending
    * order. If there are no NameRecords that meet this
    * criteria returns an empty list. 
    */
   public ArrayList<String> alwaysLessPopular() {
       
   }
   
   /**
    * Return the NameRecord in this Names object that matches the given String.
    * <br>
    * <tt>pre: name != null</tt>
    * @param name The name to search for.
    * @return The name record with the given name or null if no NameRecord in this Names
    * object contains the given name.
    */
   public NameRecord getName(String name) {
       if(name == null)
           throw new IllegalArgumentException("The parameter name cannot be null");
   }
}
