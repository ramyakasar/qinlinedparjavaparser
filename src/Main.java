import visitor.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import syntaxtree.*;
public class Main {
public static void main(String[] args) throws FileNotFoundException {
try {
	InputStream in = new FileInputStream(new File("testinput/T1.java"));
	Node root = new QInlinedParJavaParser(in).Goal();
	System.out.println("Program parsed successfully");
	root.accept(new GJNoArguDepthFirst());
}
catch (ParseException e) {
	System.out.println(e.toString());
}
}
}