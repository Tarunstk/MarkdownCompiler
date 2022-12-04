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
public abstract class ConvertToHtml {
    public abstract void outputHtml(Matcher m, PrintWriter pw);
}
