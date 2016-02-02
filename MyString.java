/*
 * Author: Matthew Turner
 * Program 1 - MyString
 * CSC230-02 Spring 2016
 */
package program1;

public class MyString {
  public MyStrining(){
  private char[] strChars;
  private int curr_length;
  private String str;

  //constructor that stes array to null and length to 0
  public MyString(){
      strChars = null;
      curr_length = 0;
  }

  //constructor that sets array to string and gets the length
  public MyString(String str){
      strChars = str.toCharArray();
      curr_length = str.length();
  }

  //constructor that is a copy of the string arguement
  public MyString(MyString str){
      strChars = str.strChars;
      curr_length = str.length();
  }

  //method that returns number in the string
  public int length(){
      return curr_length;
  }

  //method that adds additional memory to array
  private void ensureCapacity() {
      if(strChars == null) {
          curr_length = 1;
      }
      if((curr_length > 0)&&(strChars.length - 1 < curr_length)){
          char newArray[] = new char[curr_length + 1];
              for (int i = 0; i <= this.length(); i++)
                  newArray[i] = strChars[i];
              strChars = newArray;
      }
  }

  //returns a string of the MyString object
  public String toString() {
      return new String(strChars);
  }

  //concat method takes MyString parameter and returns an object
  public MyString concat(MyString str){
          int length = this.strChars.length + str.strChars.length;
          strChars = new char[length];
      for (int i = 0; i < this.strChars.length; i++){
          strChars[i] = this.strChars[i];}
      for (int i = 0; i < str.strChars.length; i++){
          strChars[this.strChars.length + i] = str.strChars[i];}
      return new MyString(str);
  }

  //concat method that takes String parameter and retuns an object
  public MyString concat(String str) {
          int length = this.strChars.length + strChars.length;
          strChars = new char[length];
      for (int i = 0; i < this.strChars.length; i++){
          strChars[i] = this.strChars[i];}
      for (int i = 0; i < strChars.length; i++){
          strChars[this.strChars.length + i] = strChars[i];}
      return new MyString(str);
  }

  //method that test if the parameter and array are the same
  public boolean equals(MyString str) {
      if(str.equals(strChars)){
          return true;
      }
      else{
          return false;
      }
  }

  //method that compares the thisMyString and the parameter
  public int compareTo(MyString str) {
      int index = 0;
      while(index < this.strChars.length && index < str.strChars.length){
          if(this.strChars[index] < str.strChars[index]){
              return -1;
          }
          else if(this.strChars[index] > str.strChars[index]){
              return 1;
          }
          index++;
      }
      if(this.strChars.length < str.strChars.length){
          return -1;
      }
      else if(this.strChars.length == str.strChars.length){
          return 0;
      }
      else{
          return 1;
      }
  }

  //method takes an interger and return a location in the array
  public char get(int index) {
      if(index < strChars.length && index > 0){
      }
      return strChars[index];
  }

  //sets the string to uppercase
  public MyString toUpper(){
      String upperS = str;
      for(int a = 0; a < strChars.length; a++){
          if(strChars[a] == 32){
              upperS += strChars[a];
          }
          else if(strChars[a] > 65 && strChars[a] < 90){
              upperS += (char) (strChars[a] + 32);
          }
          else{
              upperS += strChars[a];
          }
      }
          MyString str = new MyString(upperS);
      return str;}

  //sets the string to lowercase
  public MyString toLower(){
      String lowerS = str;
      for(int j = 0; j < strChars.length; j++){
          if(strChars[j] == 32){
              lowerS += strChars[j];
          }
          else if (strChars[j] > 97 && strChars[j] < 122){
              lowerS += (char) (strChars[j] + 32);
          }
          else{
              lowerS += strChars[j];
          }
      }
          MyString str = new MyString(lowerS);
      return str;
  }

  //method that finds the first occurrence
  public int indexOf(MyString str) {
  for(int i = 0; i < str.length(); i++){
          if(str.equals(str)){
              return i;
          }
  }
      return -1;
  }

  //method that finds the last occurrence
  public int lastIndexOf(MyString str) {
      for(int i = 0; i < str.length(); i++){
          if(str.equals(str)){
              return str.lastIndexOf(str);
          }
  }
  return -1;
  }

  //method that returns a substring with int location as the start
  public MyString substring(int start) {
      if(start < 0 || start > strChars.length) {
          throw new IndexOutOfBoundsException();
      }
          MyString newStr = new MyString();
              newStr.curr_length = newStr.curr_length - (start++);
                  newStr.strChars = new char [newStr.curr_length];
          for (int i = 0; i < newStr.curr_length; i++){
              newStr.strChars[i] = this.strChars[start++];
          }
      return newStr;
  }

  //method that returns a substring with int locations as the start and end
  public MyString substring(int start, int end) {
      if(start < 0 || start > strChars.length || start > end){
          throw new IndexOutOfBoundsException();
      }
          MyString newStr = new MyString();
              newStr.curr_length = newStr.curr_length - (start++);
                  newStr.strChars = new char [newStr.curr_length];
          for (int s = 0; s < newStr.curr_length; s++){
              newStr.strChars[s] = this.strChars[start++];
      return newStr;
          }
          MyString endStr = new MyString();
              endStr.curr_length = endStr.curr_length - (end+1);
                  endStr.strChars = new char [endStr.curr_length];
          for (int e = 0; e < endStr.curr_length; e++){
              endStr.strChars[e] = this.strChars[end+1];
          }
      return endStr;
  }
}
