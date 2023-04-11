# qinlinedparjavaparser

Use this project to check if a java program conforms to qinlinedpar Java grammar or not.

The grammar html is given here.
http://www.cse.iitm.ac.in/~krishna/cs6235/qinlinedparjava.html

Place your java file in testinputs folder.
And change the name of the file in Main class (in the default package) in the line 
`````
InputStream in = new FileInputStream(new File("testinput/T1.java"));
`````

When you run Main, if the code conforms to qinlinedparjava grammar, it prints "Program parsed successfully" else an error message will be displayed.
