/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.stevens.cpe552.MarkdownCompiler;

import java.io.*;
import java.util.regex.*;


/**
 *
 * @author tarunstk
 */
public class ReadMarkdown {
   final static Pattern head = Pattern.compile("(#{1,3})\\s+(.*)");
   final static Pattern link = Pattern.compile("(.*)(\\[link\\])(.*)");
   //final static Pattern image = Pattern.compile("(.*)(
    
    //final static Pattern image = 
    public static void main(String[] args)throws Exception
    {
        String filename = args.length > 1 ?  args[0] : "test.md";
        //String out = filename.replace(".md", ".txt");
        PrintWriter out1 = new PrintWriter ("test.txt");
        BufferedReader rd = new BufferedReader(new FileReader(filename));
        //String line = rd.readLine();
        String line; 
        String s = ""; //Figure out String Builder. 
        while((line = rd.readLine())!=null)
        {
            s = s + line +"\n";
        }
        System.out.println(s);
        Matcher m = head.matcher(s);
        boolean b = m.find();
        Matcher m2 = link.matcher(s); //Uncomment after figuring out the String builder
        boolean b2 = m2.find();
        if(b && b2)
        {
        out1.println("<!DOCTYPE html>");
        out1.println("<html>");
        out1.println("\t <head><title>"+filename+"</title></head>");
        out1.println("<body>");
        out1.println("<h1>"+m.group(2)+"</h1>");
        out1.println(m2.group(1)+"<a href="+m2.group(3)+">"+m2.group(2)+"</a>");
        out1.close();
        }
    }
    
}


