package com.pns.allprogramminglanguages.activity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.pns.allprogramminglanguages.R;
import com.pns.allprogramminglanguages.adapter.ListViewAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

public class ListActivity extends AppCompatActivity {

    private TextView emojiText;
    private ExpandableListView expandableListView;
    private Toast toast;
    private ArrayList<String> categoryList;
    private Map<String, ArrayList<String>> listItem;
    private int randomNum1 = 0;
    private int randomNum2 = 0;

    private String[] emojiList;
    private String[] greetings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Toolbar toolbar = findViewById(R.id.list_activity_toolBar);
        emojiText = findViewById(R.id.list_activity_emoji);
        TextView titleText = findViewById(R.id.list_activity_title);
        expandableListView = findViewById(R.id.expandable_list_view);
        categoryList = new ArrayList<>();
        listItem = new HashMap<>();

        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(v -> finish());

        emojiList = getResources().getStringArray(R.array.emojiList);
        greetings = getResources().getStringArray(R.array.greetings);

        String title = getIntent().getStringExtra("title");
        titleText.setText(title);

        if (title != null) {
            createData(title);
        }

        showEmoji();

        emojiText.setOnClickListener(v -> {

            if (toast != null) {
                toast.cancel();

            } else {

                toast = Toast.makeText(this, greetings[randomNum2] + " " + emojiList[randomNum1], Toast.LENGTH_SHORT);
                toast.show();
                showEmoji();
                new Handler().postDelayed(() -> toast = null, 1000);
            }
        });
    }

    private void showEmoji() {

        randomNum1 = new Random().nextInt(54);
        randomNum2 = new Random().nextInt(34);
        emojiText.setText(emojiList[randomNum1]);
    }

    private void createData(String title) {

        if (title.equals("C")) {

            ArrayList<String> arrayList1 = new ArrayList<>();
            ArrayList<String> arrayList2 = new ArrayList<>();
            ArrayList<String> arrayList3 = new ArrayList<>();
            ArrayList<String> arrayList4 = new ArrayList<>();
            ArrayList<String> arrayList5 = new ArrayList<>();
            ArrayList<String> arrayList6 = new ArrayList<>();
            ArrayList<String> arrayList7 = new ArrayList<>();
            ArrayList<String> arrayList8 = new ArrayList<>();
            ArrayList<String> arrayList9 = new ArrayList<>();
            ArrayList<String> arrayList10 = new ArrayList<>();
            ArrayList<String> arrayList11 = new ArrayList<>();
            ArrayList<String> arrayList12 = new ArrayList<>();
            ArrayList<String> arrayList13 = new ArrayList<>();
            ArrayList<String> arrayList14 = new ArrayList<>();
            ArrayList<String> arrayList15 = new ArrayList<>();
            ArrayList<String> arrayList16 = new ArrayList<>();
            ArrayList<String> arrayList17 = new ArrayList<>();
            ArrayList<String> arrayList18 = new ArrayList<>();
            ArrayList<String> arrayList19 = new ArrayList<>();
            ArrayList<String> arrayList20 = new ArrayList<>();
            ArrayList<String> arrayList21 = new ArrayList<>();
            ArrayList<String> arrayList22 = new ArrayList<>();

            //---------------Topics-----------------------------

            categoryList.add("Wikipedia");
            categoryList.add("C Tutorial");
            categoryList.add("C Control Statements");
            categoryList.add("C Functions");
            categoryList.add("C Array");
            categoryList.add("C Pointers");
            categoryList.add("C Dynamic Memory");
            categoryList.add("C Strings");
            categoryList.add("C Math");
            categoryList.add("C Structure Union");
            categoryList.add("C File Handling");
            categoryList.add("C Preprocessor");
            categoryList.add("C Command Line");
            categoryList.add("C Misc");
            categoryList.add("C Programming Test");
            categoryList.add("MCQ");
            categoryList.add("Interview Preparation");
            categoryList.add("Compiler");
            categoryList.add("Advance");
            categoryList.add("Programs");
            categoryList.add("StackOverflow");
            categoryList.add("Video Tutorials");

            //--------------------Sub topics-----------------------------

            arrayList1.add("Introduction");

            arrayList2.add("What is C Language");
            arrayList2.add("History of C");
            arrayList2.add("Features of C");
            arrayList2.add("How to install C");
            arrayList2.add("First C Program");
            arrayList2.add("Compilation Process in C");
            arrayList2.add("printf scanf");
            arrayList2.add("Variables in C");
            arrayList2.add("Data Types in c");
            arrayList2.add("Keywords in c");
            arrayList2.add("C Identifiers");
            arrayList2.add("C Operators");
            arrayList2.add("C Comments");
            arrayList2.add("C Format Specifier");
            arrayList2.add("C Escape Sequence");
            arrayList2.add("ASCII value in C");
            arrayList2.add("Constants in C");
            arrayList2.add("Literals in C");
            arrayList2.add("Tokens in C");
            arrayList2.add("C Boolean");
            arrayList2.add("Static in C");
            arrayList2.add("Programming Errors in C");
            arrayList2.add("Compile time vs Runtime");
            arrayList2.add("Conditional Operator in C");
            arrayList2.add("Bitwise Operator in C");
            arrayList2.add("2s complement in C");
            arrayList2.add("C Fundamental Test");

            arrayList3.add("C if-else");
            arrayList3.add("C switch");
            arrayList3.add("if-else vs switch");
            arrayList3.add("C Loops");
            arrayList3.add("C do-while loop");
            arrayList3.add("C while loop");
            arrayList3.add("C for loop");
            arrayList3.add("Nested Loops in C");
            arrayList3.add("Infinite Loop in C");
            arrayList3.add("C break");
            arrayList3.add("C continue");
            arrayList3.add("C goto");
            arrayList3.add("Type Casting");
            arrayList3.add("C Control Statement Test");

            arrayList4.add("What is function");
            arrayList4.add("Call: Value & Reference");
            arrayList4.add("Recursion in c");
            arrayList4.add("Storage Classes");
            arrayList4.add("C Functions Test");

            arrayList5.add("1-D Array");
            arrayList5.add("2-D Array");
            arrayList5.add("Return an Array in C");
            arrayList5.add("Array to Function");
            arrayList5.add("C Array Test");

            arrayList6.add("C Pointers");
            arrayList6.add("C Pointer to Pointer");
            arrayList6.add("C Pointer Arithmetic");
            arrayList6.add("Dangling Pointers in C");
            arrayList6.add("sizeof() operator in C");
            arrayList6.add("const Pointer in C");
            arrayList6.add("void pointer in C");
            arrayList6.add("C Dereference Pointer");
            arrayList6.add("Null Pointer in C");
            arrayList6.add("C Function Pointer");
            arrayList6.add("Function pointer as argument in C");
            arrayList6.add("C Pointers Test");

            arrayList7.add("Dynamic memory");

            arrayList8.add("String in C");
            arrayList8.add("C gets() & puts()");
            arrayList8.add("C String Functions");
            arrayList8.add("C strlen()");
            arrayList8.add("C strcpy()");
            arrayList8.add("C strcat()");
            arrayList8.add("C strcmp()");
            arrayList8.add("C strrev()");
            arrayList8.add("C strlwr()");
            arrayList8.add("C strupr()");
            arrayList8.add("C strstr()");
            arrayList8.add("C String Test");

            arrayList9.add("C Math Functions");

            arrayList10.add("C Structure");
            arrayList10.add("typedef in C");
            arrayList10.add("C Array of Structures");
            arrayList10.add("C Nested Structure");
            arrayList10.add("Structure Padding in C");
            arrayList10.add("C Union");
            arrayList10.add("C Structure Test");

            arrayList11.add("C File Handling");
            arrayList11.add("C fprintf() fscanf()");
            arrayList11.add("C fputc() fgetc()");
            arrayList11.add("C fputs() fgets()");
            arrayList11.add("C fseek()");
            arrayList11.add("C rewind()");
            arrayList11.add("C ftell()");

            arrayList12.add("C Preprocessor");
            arrayList12.add("C Macros");
            arrayList12.add("C #include");
            arrayList12.add("C #define");
            arrayList12.add("C #undef");
            arrayList12.add("C #ifdef");
            arrayList12.add("C #ifndef");
            arrayList12.add("C #if");
            arrayList12.add("C #else");
            arrayList12.add("C #error");
            arrayList12.add("C #pragma");
            arrayList12.add("C Preprocessor Test");

            arrayList13.add("Command Line Arguments");

            arrayList14.add("C Expressions");
            arrayList14.add("Data Segments");
            arrayList14.add("Flow of C Program");
            arrayList14.add("Classification of Programming Languages");
            arrayList14.add("Enum in C");

            arrayList15.add("C Programming Test");

            arrayList16.add("C language MCQ");

            arrayList17.add("Resource 1");
            arrayList17.add("Resource 2");

            arrayList18.add("Online C Compiler");

            arrayList19.add("C Program to print numbers from 1 to N without using semicolon?");
            arrayList19.add("How to find sum of two numbers without using any operator");
            arrayList19.add("How will you show memory representation of C variables?");
            arrayList19.add("Condition To Print “HelloWord”");
            arrayList19.add("Change/add only one character and print ‘*’ exactly 20 times");
            arrayList19.add("How can we sum the digits of a given number in single statement?");
            arrayList19.add("What is the best way in C to convert a number to a string?");
            arrayList19.add("Calculate Logn in one line");
            arrayList19.add("Print “Even” or “Odd” without using Conditional statement");
            arrayList19.add("How will you print numbers from 1 to 100 without using loop?");
            arrayList19.add("How can we sum the digits of a given number in single statement?");
            arrayList19.add("How will you print “Geeks for Geeks” without using a semicolon");
            arrayList19.add("Write a one line C function to round floating point numbers");
            arrayList19.add("How will implement Your Own sizeof");
            arrayList19.add("How to count set bits in a floating point number in C?");
            arrayList19.add("How to change the output of printf() in main() ?");
            arrayList19.add("How to find length of a string without string.h and loop in C?");
            arrayList19.add("Implement your own itoa()");
            arrayList19.add("Write a C program that does not terminate when Ctrl+C is pressed");
            arrayList19.add("How to measure time taken by a function in C?");
            arrayList19.add("Print a long int in C using putchar() only");
            arrayList19.add("Convert a floating point number to string in C");
            arrayList19.add("How to write a running C code without main()?");
            arrayList19.add("Write your own memcpy()");
            arrayList19.add("C program to print characters without using format specifiers");
            arrayList19.add("C program to print a string without any quote (singe or double) in the program");
            arrayList19.add("Execute both if and else statements simultaneously");
            arrayList19.add("Print “Hello World” without using any header file");
            arrayList19.add("Use of & in scanf() but not in printf()");

            arrayList20.add("C \"Hello, World!\" Program");
            arrayList20.add("C Program to Print an Integer (Entered by the User)");
            arrayList20.add("C Program to Add Two Integers");
            arrayList20.add("C Program to Multiply Two Floating-Point Numbers");
            arrayList20.add("C Program to Find ASCII Value of a Character");
            arrayList20.add("C Program to Compute Quotient and Remainder");
            arrayList20.add("C Program to Find the Size of int, float, double and char");
            arrayList20.add("C Program to Demonstrate the Working of Keyword long");
            arrayList20.add("C Program to Swap Two Numbers");
            arrayList20.add("C Program to Check Whether a Number is Even or Odd");
            arrayList20.add("C Program to Check Whether a Character is a Vowel or Consonant");
            arrayList20.add("C Program to Find the Largest Number Among Three Numbers");
            arrayList20.add("C Program to Find the Roots of a Quadratic Equation");
            arrayList20.add("C Program to Check Leap Year");
            arrayList20.add("C Program to Check Whether a Number is Positive or Negative");
            arrayList20.add("C Program to Check Whether a Character is an Alphabet or not");
            arrayList20.add("C Program to Calculate the Sum of Natural Numbers");
            arrayList20.add("C Program to Find Factorial of a Number");
            arrayList20.add("C Program to Generate Multiplication Table");
            arrayList20.add("C Program to Display Fibonacci Sequence"); ////////////////////);
            arrayList20.add("C Program to Find GCD of two Numbers");
            arrayList20.add("C Program to Find LCM of two Numbers");
            arrayList20.add("C Program to Display Characters from A to Z Using Loop");
            arrayList20.add("C Program to Count Number of Digits in an Integer");
            arrayList20.add("C Program to Reverse a Number");
            arrayList20.add("C Program to Calculate the Power of a Number");
            arrayList20.add("C Program to Check Whether a Number is Palindrome or Not");
            arrayList20.add("C Program to Check Whether a Number is Prime or Not");
            arrayList20.add("C Program to Display Prime Numbers Between Two Intervals");
            arrayList20.add("C Program to Check Armstrong Number");
            arrayList20.add("C Program to Display Armstrong Number Between Two Intervals");
            arrayList20.add("C Program to Display Factors of a Number");
            arrayList20.add("C Program to Make a Simple Calculator Using switch...case");
            arrayList20.add("C Program to Display Prime Numbers Between Intervals Using Function");
            arrayList20.add("C Program to Check Prime or Armstrong Number Using User-defined Function");
            arrayList20.add("C Program to Check Whether a Number can be Expressed as Sum of Two Prime Numbers");
            arrayList20.add("C Program to Find the Sum of Natural Numbers using Recursion");
            arrayList20.add("C Program to Find Factorial of a Number Using Recursion");
            arrayList20.add("C Program to Find G.C.D Using Recursion");
            arrayList20.add("C Program to Convert Binary Number to Decimal and vice-versa");///////////////);
            arrayList20.add("C Program to Convert Octal Number to Decimal and vice-versa");
            arrayList20.add("C Program to Convert Binary Number to Octal and vice-versa");
            arrayList20.add("C program to Reverse a Sentence Using Recursion");
            arrayList20.add("C program to calculate the power using recursion");
            arrayList20.add("C Program to Calculate Average Using Arrays");
            arrayList20.add("C Program to Find Largest Element in an Array");
            arrayList20.add("C Program to Calculate Standard Deviation");
            arrayList20.add("C Program to Add Two Matrices Using Multi-dimensional Arrays");
            arrayList20.add("C Program to Multiply Two Matrices Using Multi-dimensional Arrays");
            arrayList20.add("C Program to Find Transpose of a Matrix");
            arrayList20.add("C Program to Multiply two Matrices by Passing Matrix to a Function");
            arrayList20.add("C Program to Access Array Elements Using Pointer");
            arrayList20.add("C Program Swap Numbers in Cyclic Order Using Call by Reference");
            arrayList20.add("C Program to Find Largest Number Using Dynamic Memory Allocation");
            arrayList20.add("C Program to Find the Frequency of Characters in a String");
            arrayList20.add("C Program to Count the Number of Vowels, Consonants and so on");
            arrayList20.add("C Program to Remove all Characters in a String Except Alphabets");
            arrayList20.add("C Program to Find the Length of a String");
            arrayList20.add("C Program to Concatenate Two Strings");
            arrayList20.add("C Program to Copy String Without Using strcpy()");/////////////////////////);
            arrayList20.add("C Program to Sort Elements in Lexicographical Order (Dictionary Order)");
            arrayList20.add("C Program to Store Information of a Student Using Structure");
            arrayList20.add("C Program to Add Two Distances (in inch-feet system) using Structures");
            arrayList20.add("C Program to Add Two Complex Numbers by Passing Structure to a Function");
            arrayList20.add("C Program to Calculate Difference Between Two Time Periods");
            arrayList20.add("C Program to Store Information of Students Using Structure");
            arrayList20.add("C Program to Store Data in Structures Dynamically");
            arrayList20.add("C Program to Write a Sentence to a File");
            arrayList20.add("C Program to Read a Line From a File and Display it");
            arrayList20.add("C Program to Display its own Source Code as Output");
            arrayList20.add("C Program to Print Pyramids and Patterns");

            arrayList21.add("QnAs");

            arrayList22.add("Complete C in 1 Video (3+ hour) : English");
            arrayList22.add("Complete C in 1 Video (15+ hour) : Hindi");
            arrayList22.add("Playlist 41 Videos : English");
            arrayList22.add("Playlist : 87 Videos : Hindi");

            //-----------------------------------------------------------------------

            listItem.put(categoryList.get(0), arrayList1);
            listItem.put(categoryList.get(1), arrayList2);
            listItem.put(categoryList.get(2), arrayList3);
            listItem.put(categoryList.get(3), arrayList4);
            listItem.put(categoryList.get(4), arrayList5);
            listItem.put(categoryList.get(5), arrayList6);
            listItem.put(categoryList.get(6), arrayList7);
            listItem.put(categoryList.get(7), arrayList8);
            listItem.put(categoryList.get(8), arrayList9);
            listItem.put(categoryList.get(9), arrayList10);
            listItem.put(categoryList.get(10), arrayList11);
            listItem.put(categoryList.get(11), arrayList12);
            listItem.put(categoryList.get(12), arrayList13);
            listItem.put(categoryList.get(13), arrayList14);
            listItem.put(categoryList.get(14), arrayList15);
            listItem.put(categoryList.get(15), arrayList16);
            listItem.put(categoryList.get(16), arrayList17);
            listItem.put(categoryList.get(17), arrayList18);
            listItem.put(categoryList.get(18), arrayList19);
            listItem.put(categoryList.get(19), arrayList20);
            listItem.put(categoryList.get(20), arrayList21);
            listItem.put(categoryList.get(21), arrayList22);

            ListViewAdapter adapter = new ListViewAdapter(categoryList, listItem, this, title);
            expandableListView.setAdapter(adapter);
        }

        if (title.equals("C++")) {

            ArrayList<String> arrayList1 = new ArrayList<>();
            ArrayList<String> arrayList2 = new ArrayList<>();
            ArrayList<String> arrayList3 = new ArrayList<>();
            ArrayList<String> arrayList4 = new ArrayList<>();
            ArrayList<String> arrayList5 = new ArrayList<>();
            ArrayList<String> arrayList6 = new ArrayList<>();
            ArrayList<String> arrayList7 = new ArrayList<>();
            ArrayList<String> arrayList8 = new ArrayList<>();
            ArrayList<String> arrayList9 = new ArrayList<>();
            ArrayList<String> arrayList10 = new ArrayList<>();
            ArrayList<String> arrayList11 = new ArrayList<>();
            ArrayList<String> arrayList12 = new ArrayList<>();
            ArrayList<String> arrayList13 = new ArrayList<>();
            ArrayList<String> arrayList14 = new ArrayList<>();
            ArrayList<String> arrayList15 = new ArrayList<>();
            ArrayList<String> arrayList16 = new ArrayList<>();
            ArrayList<String> arrayList17 = new ArrayList<>();
            ArrayList<String> arrayList18 = new ArrayList<>();
            ArrayList<String> arrayList19 = new ArrayList<>();
            ArrayList<String> arrayList20 = new ArrayList<>();
            ArrayList<String> arrayList21 = new ArrayList<>();
            ArrayList<String> arrayList22 = new ArrayList<>();
            ArrayList<String> arrayList23 = new ArrayList<>();
            ArrayList<String> arrayList24 = new ArrayList<>();
            ArrayList<String> arrayList25 = new ArrayList<>();

            //---------------Topics-----------------------------

            categoryList.add("Wikipedia");
            categoryList.add("C++ Tutorial");
            categoryList.add("C++ Control Statement");
            categoryList.add("C++ Functions");
            categoryList.add("C++ Arrays");
            categoryList.add("C++ Pointers");
            categoryList.add("C++ Object Class");
            categoryList.add("C++ Inheritance");
            categoryList.add("C++ Polymorphism");
            categoryList.add("C++ Abstraction");
            categoryList.add("C++ Namespaces");
            categoryList.add("C++ Strings");
            categoryList.add("C++ Exceptions");
            categoryList.add("C++ Templates");
            categoryList.add("Signal Handling");
            categoryList.add("C++ File & Stream");
            categoryList.add("C++ Misc");
            categoryList.add("C++ STL Tutorial");
            categoryList.add("C++ Iterators");
            categoryList.add("MCQ");
            categoryList.add("Interview Preparation");
            categoryList.add("Compiler");
            categoryList.add("Programs");
            categoryList.add("StackOverflow");
            categoryList.add("Video Tutorials");

            //--------------------Sub topics-----------------------------

            arrayList1.add("Introduction");

            arrayList2.add("C++ Tutorial");
            arrayList2.add("C vs C++");
            arrayList2.add("C++ History");
            arrayList2.add("C++ Features");
            arrayList2.add("C++ Installation");
            arrayList2.add("C++ Program");
            arrayList2.add("C++ cout, cin, endl");
            arrayList2.add("C++ Variable");
            arrayList2.add("C++ Data types");
            arrayList2.add("C++ Keywords");
            arrayList2.add("C++ Operators");
            arrayList2.add("C++ Identifiers");
            arrayList2.add("C++ Expression");

            arrayList3.add("C++ if-else");
            arrayList3.add("C++ switch");
            arrayList3.add("C++ For Loop");
            arrayList3.add("C++ While Loop");
            arrayList3.add("C++ Do-While Loop");
            arrayList3.add("C++ Break Statement");
            arrayList3.add("C++ Continue Statement");
            arrayList3.add("C++ Goto Statement");
            arrayList3.add("C++ Comments");

            arrayList4.add("C++ Functions");
            arrayList4.add("Call by value & reference");
            arrayList4.add("C++ Recursion");
            arrayList4.add("C++ Storage Classes");

            arrayList5.add("C++ Arrays");
            arrayList5.add("C++ Array to Function");
            arrayList5.add("Multidimensional Arrays");

            arrayList6.add("C++ Pointers");
            arrayList6.add("sizeof() operator in C++");
            arrayList6.add("C++ Array of Pointers");
            arrayList6.add("C++ Void Pointer");
            arrayList6.add("C++ References");
            arrayList6.add("Reference vs Pointer");
            arrayList6.add("Function Pointer in C++");
            arrayList6.add("C++ Memory Management");
            arrayList6.add("malloc() vs new in C++");
            arrayList6.add("free vs delete in C++");

            arrayList7.add("C++ OOPs Concepts");
            arrayList7.add("C++ Object Class");
            arrayList7.add("C++ Constructor");
            arrayList7.add("C++ Copy Constructor");
            arrayList7.add("C++ Destructor");
            arrayList7.add("C++ this Pointer");
            arrayList7.add("C++ static");
            arrayList7.add("C++ Structs");
            arrayList7.add("C++ Enumeration");
            arrayList7.add("C++ Friend Function");
            arrayList7.add("C++ Math Functions");

            arrayList8.add("C++ Inheritance");
            arrayList8.add("C++ Aggregation");

            arrayList9.add("C++ Polymorphism");
            arrayList9.add("C++ Overloading");
            arrayList9.add("C++ Overriding");
            arrayList9.add("C++ Virtual Function");

            arrayList10.add("C++ Interfaces");
            arrayList10.add("C++ Data Abstraction");

            arrayList11.add("Namespaces");

            arrayList12.add("Strings");

            arrayList13.add("C++ Exception Handling");
            arrayList13.add("C++ try/catch");
            arrayList13.add("C++ User-Defined exception");

            arrayList14.add("C++ Templates");

            arrayList15.add("C++ Templates");

            arrayList16.add("C++ File & Stream");
            arrayList16.add("C++ getline()");

            arrayList17.add("C++ vs C#");
            arrayList17.add("C++ int to string");
            arrayList17.add("C++ vs Python");

            arrayList18.add("C++ STL Components");
            arrayList18.add("C++ Vector");
            arrayList18.add("Initialize Vector in C++");
            arrayList18.add("C++ Deque");
            arrayList18.add("C++ List");
            arrayList18.add("C++ Set");
            arrayList18.add("C++ Stack");
            arrayList18.add("C++ Queue");
            arrayList18.add("C++ Priority Queue");
            arrayList18.add("C++ Map");
            arrayList18.add("C++ Multimap");
            arrayList18.add("C++ Bitset");
            arrayList18.add("C++ Algorithm");

            arrayList19.add("C++ Iterators");
            arrayList19.add("C++ Bidirectional Iterator");
            arrayList19.add("C++ Forward Iterator");
            arrayList19.add("C++ Input Iterator");
            arrayList19.add("C++ Output Iterator");

            arrayList20.add("C++ MCQ");

            arrayList21.add("Resource 1");
            arrayList21.add("Resource 2");
            arrayList21.add("Resource 3");

            arrayList22.add("C++ Online Compiler");

            arrayList23.add("Fibonacci Series");
            arrayList23.add("Prime Number");
            arrayList23.add("Palindrome Number");
            arrayList23.add("Factorial");
            arrayList23.add("Armstrong Number");
            arrayList23.add("Sum of digits");
            arrayList23.add("Reverse Number");
            arrayList23.add("Swap Number");
            arrayList23.add("Matrix Multiplication");
            arrayList23.add("Decimal to Binary");
            arrayList23.add("Number in Characters");
            arrayList23.add("Alphabet Triangle");
            arrayList23.add("Number Triangle");
            arrayList23.add("Fibonacci Triangle");
            arrayList23.add("Char array to string in C++");
            arrayList23.add("Calculator Program in C++");
            arrayList23.add("Program to convert infix to postfix expression in C++ using the Stack Data Structure");
            arrayList23.add("Virtual Destructor in C++");

            arrayList24.add("QnAs");

            arrayList25.add("Complete C in 1 Video (4+ hour) : English");
            arrayList25.add("Complete C in 1 Video (1+ hour) : Hindi");
            arrayList25.add("Playlist 151 Videos : English");
            arrayList25.add("Playlist : 73 Videos : Hindi");

            //-----------------------------------------------------------------------

            listItem.put(categoryList.get(0), arrayList1);
            listItem.put(categoryList.get(1), arrayList2);
            listItem.put(categoryList.get(2), arrayList3);
            listItem.put(categoryList.get(3), arrayList4);
            listItem.put(categoryList.get(4), arrayList5);
            listItem.put(categoryList.get(5), arrayList6);
            listItem.put(categoryList.get(6), arrayList7);
            listItem.put(categoryList.get(7), arrayList8);
            listItem.put(categoryList.get(8), arrayList9);
            listItem.put(categoryList.get(9), arrayList10);
            listItem.put(categoryList.get(10), arrayList11);
            listItem.put(categoryList.get(11), arrayList12);
            listItem.put(categoryList.get(12), arrayList13);
            listItem.put(categoryList.get(13), arrayList14);
            listItem.put(categoryList.get(14), arrayList15);
            listItem.put(categoryList.get(15), arrayList16);
            listItem.put(categoryList.get(16), arrayList17);
            listItem.put(categoryList.get(17), arrayList18);
            listItem.put(categoryList.get(18), arrayList19);
            listItem.put(categoryList.get(19), arrayList20);
            listItem.put(categoryList.get(20), arrayList21);
            listItem.put(categoryList.get(21), arrayList22);
            listItem.put(categoryList.get(22), arrayList23);
            listItem.put(categoryList.get(23), arrayList24);
            listItem.put(categoryList.get(24), arrayList25);

            ListViewAdapter adapter = new ListViewAdapter(categoryList, listItem, this, title);
            expandableListView.setAdapter(adapter);
        }

        if (title.equals("Java")) {

            ArrayList<String> arrayList1 = new ArrayList<>();
            ArrayList<String> arrayList2 = new ArrayList<>();
            ArrayList<String> arrayList3 = new ArrayList<>();
            ArrayList<String> arrayList4 = new ArrayList<>();
            ArrayList<String> arrayList5 = new ArrayList<>();
            ArrayList<String> arrayList6 = new ArrayList<>();
            ArrayList<String> arrayList7 = new ArrayList<>();
            ArrayList<String> arrayList8 = new ArrayList<>();
            ArrayList<String> arrayList9 = new ArrayList<>();
            ArrayList<String> arrayList10 = new ArrayList<>();
            ArrayList<String> arrayList11 = new ArrayList<>();
            ArrayList<String> arrayList12 = new ArrayList<>();
            ArrayList<String> arrayList13 = new ArrayList<>();
            ArrayList<String> arrayList14 = new ArrayList<>();
            ArrayList<String> arrayList15 = new ArrayList<>();
            ArrayList<String> arrayList16 = new ArrayList<>();
            ArrayList<String> arrayList17 = new ArrayList<>();
            ArrayList<String> arrayList18 = new ArrayList<>();
            ArrayList<String> arrayList19 = new ArrayList<>();
            ArrayList<String> arrayList20 = new ArrayList<>();
            ArrayList<String> arrayList21 = new ArrayList<>();
            ArrayList<String> arrayList22 = new ArrayList<>();
            ArrayList<String> arrayList23 = new ArrayList<>();
            ArrayList<String> arrayList24 = new ArrayList<>();
            ArrayList<String> arrayList25 = new ArrayList<>();
            ArrayList<String> arrayList26 = new ArrayList<>();
            ArrayList<String> arrayList27 = new ArrayList<>();
            ArrayList<String> arrayList28 = new ArrayList<>();
            ArrayList<String> arrayList29 = new ArrayList<>();
            ArrayList<String> arrayList30 = new ArrayList<>();
            ArrayList<String> arrayList31 = new ArrayList<>();
            ArrayList<String> arrayList32 = new ArrayList<>();
            ArrayList<String> arrayList33 = new ArrayList<>();

            //---------------Topics-----------------------------

            categoryList.add("Wikipedia");
            categoryList.add("Java Tutorial");
            categoryList.add("Control Statements");
            categoryList.add("Java Object Class");
            categoryList.add("Java Inheritance");
            categoryList.add("Java Polymorphism");
            categoryList.add("Java Abstraction");
            categoryList.add("Java Encapsulation");
            categoryList.add("Java Array");
            categoryList.add("Java OOPs Misc");
            categoryList.add("Java String");
            categoryList.add("Java String Methods");
            categoryList.add("Java Regex");
            categoryList.add("Exception Handling");
            categoryList.add("Java Inner classes");
            categoryList.add("Java Multithreading");
            categoryList.add("Java Synchronization");
            categoryList.add("Java I/O");
            categoryList.add("Java Serialization");
            categoryList.add("Java AWT & Events");
            categoryList.add("Java Swing");
            categoryList.add("Java Swing Apps");
            categoryList.add("Java Layout Managers");
            categoryList.add("Java Applet");
            categoryList.add("Java Reflection");
            categoryList.add("Java Date");
            categoryList.add("Java Conversion");
            categoryList.add("Java Collection");
            categoryList.add("Interview Questions");
            categoryList.add("Compiler");
            categoryList.add("Programs");
            categoryList.add("StackOverflow");
            categoryList.add("Video Tutorials");

            //--------------------Sub topics-----------------------------

            arrayList1.add("Introduction");

            arrayList2.add("What is java");
            arrayList2.add("History of java");
            arrayList2.add("Features of java");
            arrayList2.add("C++ vs java");
            arrayList2.add("Hello java Program");
            arrayList2.add("Program Internal");
            arrayList2.add("How to set path");
            arrayList2.add("JDK, JRE and JVM");
            arrayList2.add("JVM: Java Virtual Machine");
            arrayList2.add("Java Variables");
            arrayList2.add("Java Data Types");
            arrayList2.add("Unicode System");
            arrayList2.add("Operators");
            arrayList2.add("Keywords");//

            arrayList3.add("Java If-else");
            arrayList3.add("Java Switch");
            arrayList3.add("Java For Loop");
            arrayList3.add("Java While Loop");
            arrayList3.add("Java Do While Loop");
            arrayList3.add("Java Break");
            arrayList3.add("Java Continue");
            arrayList3.add("Java Comments");

            arrayList4.add("Java OOPs Concepts");
            arrayList4.add("Naming Convention");
            arrayList4.add("Object and Class");
            arrayList4.add("Method");
            arrayList4.add("Constructor");
            arrayList4.add("static keyword");
            arrayList4.add("this keyword");

            arrayList5.add("Inheritance(IS-A)");
            arrayList5.add("Aggregation(HAS-A)");

            arrayList6.add("Method Overloading");
            arrayList6.add("Method Overriding");
            arrayList6.add("Covariant Return Type");
            arrayList6.add("super keyword");
            arrayList6.add("Instance Initializer block");
            arrayList6.add("final keyword");
            arrayList6.add("Runtime Polymorphism");
            arrayList6.add("Dynamic Binding");
            arrayList6.add("instanceof operator");

            arrayList7.add("Abstract class");
            arrayList7.add("Interface");
            arrayList7.add("Abstract vs Interface");

            arrayList8.add("Package");
            arrayList8.add("Access Modifiers");
            arrayList8.add("Encapsulation");

            arrayList9.add("Java Array");//

            arrayList10.add("Object class");
            arrayList10.add("Object Cloning");
            arrayList10.add("Math class");
            arrayList10.add("Wrapper Class");
            arrayList10.add("Java Recursion");
            arrayList10.add("Call By Value");
            arrayList10.add("strictfp keyword");
            arrayList10.add("javadoc tool");
            arrayList10.add("Command Line Argument");
            arrayList10.add("Object vs Class");
            arrayList10.add("Overloading vs Overriding");

            arrayList11.add("What is String");
            arrayList11.add("Immutable String");
            arrayList11.add("String Comparison");
            arrayList11.add("String Concatenation");
            arrayList11.add("Substring");
            arrayList11.add("Methods of String class");
            arrayList11.add("StringBuffer class");
            arrayList11.add("StringBuilder class");
            arrayList11.add("String vs StringBuffer");
            arrayList11.add("StringBuffer vs Builder");
            arrayList11.add("Creating Immutable class");
            arrayList11.add("toString method");
            arrayList11.add("StringTokenizer class");
            arrayList11.add("Java String FAQ");
            arrayList11.add("String Handling quiz-1");

            arrayList12.add("String charAt()");
            arrayList12.add("String compareTo()");
            arrayList12.add("String concat()");
            arrayList12.add("String contains()");
            arrayList12.add("String endsWith()");
            arrayList12.add("String equals()");
            arrayList12.add("equalsIgnoreCase()");
            arrayList12.add("String format()");
            arrayList12.add("String getBytes()");
            arrayList12.add("String getChars()");
            arrayList12.add("String indexOf()");
            arrayList12.add("String intern()");
            arrayList12.add("String isEmpty()");
            arrayList12.add("String join()");
            arrayList12.add("String lastIndexOf()");
            arrayList12.add("String length()");
            arrayList12.add("String replace()");
            arrayList12.add("String replaceAll()");
            arrayList12.add("String split()");
            arrayList12.add("String startsWith()");
            arrayList12.add("String substring()");
            arrayList12.add("String toCharArray()");
            arrayList12.add("String toLowerCase()");
            arrayList12.add("String toUpperCase()");
            arrayList12.add("String trim()");
            arrayList12.add("String valueOf()");

            arrayList13.add("Java Regex API");

            arrayList14.add("Java Exceptions"); //
            arrayList14.add("Java Try-catch block");
            arrayList14.add("Java Multiple Catch Block");
            arrayList14.add("Java Nested try");
            arrayList14.add("Java Finally Block");
            arrayList14.add("Java Throw Keyword");
            arrayList14.add("Java Exception Propagation");
            arrayList14.add("Java Throws Keyword");
            arrayList14.add("Java Throw vs Throws");
            arrayList14.add("Final vs Finally vs Finalize");
            arrayList14.add("Exception Handling with Method Overriding");
            arrayList14.add("Java Custom Exceptions");
            arrayList14.add("Exception Hand. quiz-1");
            arrayList14.add("Exception Hand. quiz-2");
            arrayList14.add("Exception Hand. quiz-3");

            arrayList15.add("What is inner class");
            arrayList15.add("Member Inner class");
            arrayList15.add("Anonymous Inner class");
            arrayList15.add("Local Inner class");
            arrayList15.add("static nested class");
            arrayList15.add("Nested Interface");

            arrayList16.add("What is Multithreading");
            arrayList16.add("Life Cycle of a Thread");
            arrayList16.add("Creating Thread");
            arrayList16.add("Thread Scheduler");
            arrayList16.add("Sleeping a thread");
            arrayList16.add("Start a thread twice");
            arrayList16.add("Calling run() method");
            arrayList16.add("Joining a thread");
            arrayList16.add("Naming a thread");
            arrayList16.add("Thread Priority");
            arrayList16.add("Daemon Thread");
            arrayList16.add("Thread Pool");
            arrayList16.add("Thread Group");
            arrayList16.add("ShutdownHook");
            arrayList16.add("Performing multiple task");
            arrayList16.add("Garbage Collection");
            arrayList16.add("Runtime class");
            arrayList16.add("Multithreading quiz-1");
            arrayList16.add("Multithreading quiz-2");

            arrayList17.add("Synchronization in java");
            arrayList17.add("synchronized block");
            arrayList17.add("static synchronization");
            arrayList17.add("Deadlock in Java");
            arrayList17.add("Inter-thread Communication");
            arrayList17.add("Interrupting Thread");
            arrayList17.add("Reentrant Monitor");

            arrayList18.add("Java Input/Output");
            arrayList18.add("FileOutputStream");
            arrayList18.add("FileInputStream");
            arrayList18.add("BufferedOutputStream");
            arrayList18.add("BufferedInputStream");
            arrayList18.add("SequenceInputStream");
            arrayList18.add("ByteArrayOutputStream");
            arrayList18.add("ByteArrayInputStream");
            arrayList18.add("DataOutputStream");
            arrayList18.add("DataInputStream");
            arrayList18.add("Java FilterOutputStream");
            arrayList18.add("Java FilterInputStream");
            arrayList18.add("Java ObjectStream");
            arrayList18.add("Java ObjectStreamField");
            arrayList18.add("Console");
            arrayList18.add("FilePermission");
            arrayList18.add("Writer");
            arrayList18.add("Reader");
            arrayList18.add("FileWriter");
            arrayList18.add("FileReader");
            arrayList18.add("BufferedWriter");
            arrayList18.add("BufferedReader");
            arrayList18.add("CharArrayReader");
            arrayList18.add("CharArrayWriter");
            arrayList18.add("PrintStream");
            arrayList18.add("PrintWriter");
            arrayList18.add("OutputStreamWriter");
            arrayList18.add("InputStreamReader");
            arrayList18.add("PushbackInputStream");
            arrayList18.add("PushbackReader");
            arrayList18.add("StringWriter");
            arrayList18.add("StringReader");
            arrayList18.add("PipedWriter");
            arrayList18.add("PipedReader");
            arrayList18.add("FilterWriter");
            arrayList18.add("FilterReader");
            arrayList18.add("File");
            arrayList18.add("FileDescriptor");
            arrayList18.add("RandomAccessFile");
            arrayList18.add("java.util.Scanner");

            arrayList19.add("Java serialization");
            arrayList19.add("Java transient keyword");

            arrayList20.add("AWT Basics");
            arrayList20.add("Event Handling");
            arrayList20.add("AWT Button");
            arrayList20.add("AWT Label");
            arrayList20.add("AWT TextField");
            arrayList20.add("AWT TextArea");
            arrayList20.add("AWT Checkbox");
            arrayList20.add("AWT CheckboxGroup");
            arrayList20.add("AWT Choice");
            arrayList20.add("AWT List");
            arrayList20.add("AWT Canvas");
            arrayList20.add("AWT Scrollbar");
            arrayList20.add("AWT MenuItem & Menu");
            arrayList20.add("AWT PopupMenu");
            arrayList20.add("AWT Panel");
            arrayList20.add("AWT Dialog");
            arrayList20.add("AWT Toolkit");
            arrayList20.add("Java ActionListener");
            arrayList20.add("Java MouseListener");
            arrayList20.add("MouseMotionListener");
            arrayList20.add("Java ItemListener");
            arrayList20.add("Java KeyListener");
            arrayList20.add("Java WindowListener");
            arrayList20.add("Java Adapter classes");
            arrayList20.add("Close AWT Window");

            arrayList21.add("Swing Introduction");
            arrayList21.add("Java JButton");
            arrayList21.add("Java JLabel");
            arrayList21.add("Java JTextField");
            arrayList21.add("Java JTextArea");
            arrayList21.add("Java JPasswordField");
            arrayList21.add("Java JCheckBox");
            arrayList21.add("Java JRadioButton");
            arrayList21.add("Java JComboBox");
            arrayList21.add("Java JTable");
            arrayList21.add("Java JList");
            arrayList21.add("Java JOptionPane");
            arrayList21.add("Java JScrollBar");
            arrayList21.add("Java JMenuItem & JMenu");
            arrayList21.add("Java JPopupMenu");
            arrayList21.add("Java JCheckBoxMenuItem");
            arrayList21.add("Java JSeparator");
            arrayList21.add("Java JProgressBar");
            arrayList21.add("Java JTree");
            arrayList21.add("Java JColorChooser");
            arrayList21.add("Java JTabbedPane");
            arrayList21.add("Java JSlider");
            arrayList21.add("Java JSpinner");
            arrayList21.add("Java JDialog");
            arrayList21.add("Java JPanel");
            arrayList21.add("Java JFileChooser");
            arrayList21.add("Java JToggleButton");
            arrayList21.add("Java JToolBar");
            arrayList21.add("Java JViewport");
            arrayList21.add("Java JFrame");
            arrayList21.add("Java JComponent");
            arrayList21.add("Java JLayeredPane");
            arrayList21.add("Java JDesktopPane");
            arrayList21.add("Java JEditorPane");
            arrayList21.add("Java JScrollPane");
            arrayList21.add("Java JSplitPane");
            arrayList21.add("Java JTextPane");
            arrayList21.add("Java JRootPane");
            arrayList21.add("Using ToolTip");
            arrayList21.add("Change Title Icon");
            arrayList21.add("Executable Jar File");
            arrayList21.add("Digital Watch");
            arrayList21.add("Graphics in swing");
            arrayList21.add("Displaying Image");

            arrayList22.add("Notepad");
            arrayList22.add("Calculator");
            arrayList22.add("IP Finder");
            arrayList22.add("Word Counter");
            arrayList22.add("URL Source Generator");
            arrayList22.add("Folder Explorer");
            arrayList22.add("Puzzle Game");
            arrayList22.add("Pic Puzzle Game");
            arrayList22.add("Tic Tac Toe Game");
            arrayList22.add("Online Exam");

            arrayList23.add("BorderLayout");
            arrayList23.add("GridLayout");
            arrayList23.add("FlowLayout");
            arrayList23.add("BoxLayout");
            arrayList23.add("CardLayout");
            arrayList23.add("GridBagLayout");
            arrayList23.add("GroupLayout");
            arrayList23.add("SpringLayout");
            arrayList23.add("ScrollPaneLayout");

            arrayList24.add("Applet Basics");
            arrayList24.add("Graphics in Applet");
            arrayList24.add("Displaying image in Applet");
            arrayList24.add("Animation in Applet");
            arrayList24.add("EventHandling in Applet");
            arrayList24.add("JApplet class");
            arrayList24.add("Painting in Applet");
            arrayList24.add("Digital Clock in Applet");
            arrayList24.add("Analog Clock in Applet");
            arrayList24.add("Parameter in Applet");
            arrayList24.add("Applet Communication");

            arrayList25.add("Reflection API");
            arrayList25.add("newInstance() method");
            arrayList25.add("javap tool");
            arrayList25.add("creating javap tool");
            arrayList25.add("creating appletviewer");
            arrayList25.add("Call private method");

            arrayList26.add("Java Date Time API");
            arrayList26.add("Java LocalDate");
            arrayList26.add("Java LocalTime");
            arrayList26.add("Java LocalDateTime");
            arrayList26.add("Java MonthDay");
            arrayList26.add("Java OffsetTime");
            arrayList26.add("Java OffsetDateTime");
            arrayList26.add("Java Clock");
            arrayList26.add("Java ZonedDateTime");
            arrayList26.add("Java ZoneId");
            arrayList26.add("Java ZoneOffset");
            arrayList26.add("Java Year");
            arrayList26.add("Java YearMonth");
            arrayList26.add("Java Period");
            arrayList26.add("Java Duration");
            arrayList26.add("Java Instant");
            arrayList26.add("Java DayOfWeek enum");
            arrayList26.add("Java Month enum");

            arrayList27.add("Java String to int");
            arrayList27.add("Java int to String");
            arrayList27.add("Java String to long");
            arrayList27.add("Java long to String");
            arrayList27.add("Java String to float");
            arrayList27.add("Java float to String");
            arrayList27.add("Java String to double");
            arrayList27.add("Java double to String");
            arrayList27.add("Java String to Date");
            arrayList27.add("Java Date to String");
            arrayList27.add("Java String to char");
            arrayList27.add("Java char to String");
            arrayList27.add("Java String to Object");
            arrayList27.add("Java Object to String");
            arrayList27.add("Java int to long");
            arrayList27.add("Java long to int");
            arrayList27.add("Java int to double");
            arrayList27.add("Java double to int");
            arrayList27.add("Java char to int");
            arrayList27.add("Java int to char");
            arrayList27.add("Java String to boolean");
            arrayList27.add("Java boolean to String");
            arrayList27.add("Date to Timestamp");
            arrayList27.add("Timestamp to Date");
            arrayList27.add("Binary to Decimal");
            arrayList27.add("Decimal to Binary");
            arrayList27.add("Hex to Decimal");
            arrayList27.add("Decimal to Hex");
            arrayList27.add("Octal to Decimal");
            arrayList27.add("Decimal to Octal");

            arrayList28.add("Collection Framework");
            arrayList28.add("Java ArrayList");
            arrayList28.add("Java LinkedList");
            arrayList28.add("ArrayList vs LinkedList");
            arrayList28.add("Java List Interface");
            arrayList28.add("Java HashSet");
            arrayList28.add("Java LinkedHashSet");
            arrayList28.add("Java TreeSet");
            arrayList28.add("Queue & PriorityQueue");
            arrayList28.add("Deque & ArrayDeque");
            arrayList28.add("Java Map Interface");
            arrayList28.add("Java HashMap");
            arrayList28.add("Working of HashMap");
            arrayList28.add("Java LinkedHashMap");
            arrayList28.add("Java TreeMap");
            arrayList28.add("Java Hashtable");
            arrayList28.add("HashMap vs Hashtable");
            arrayList28.add("Java EnumSet");
            arrayList28.add("Java EnumMap");
            arrayList28.add("Collections class");
            arrayList28.add("Sorting Collections");
            arrayList28.add("Comparable interface");
            arrayList28.add("Comparator interface");
            arrayList28.add("Comparable vs Comparator");
            arrayList28.add("Properties class");
            arrayList28.add("ArrayList vs Vector");
            arrayList28.add("Java Vector");
            arrayList28.add("Java Stack");
            arrayList28.add("Collection Quiz-1");

            arrayList29.add("Interview Questions");

            arrayList30.add("Online Java compiler");

            arrayList31.add("All java programs");

            arrayList32.add("QnAs");

            arrayList33.add("Complete java in 1 Video (6+ hour) : English");
            arrayList33.add("Complete java in 1 Video (2+ hour) : Hindi");
            arrayList33.add("Playlist 114 Videos : English");
            arrayList33.add("Playlist : 74 Videos : Hindi");

            //-----------------------------------------------------------------------

            listItem.put(categoryList.get(0), arrayList1);
            listItem.put(categoryList.get(1), arrayList2);
            listItem.put(categoryList.get(2), arrayList3);
            listItem.put(categoryList.get(3), arrayList4);
            listItem.put(categoryList.get(4), arrayList5);
            listItem.put(categoryList.get(5), arrayList6);
            listItem.put(categoryList.get(6), arrayList7);
            listItem.put(categoryList.get(7), arrayList8);
            listItem.put(categoryList.get(8), arrayList9);
            listItem.put(categoryList.get(9), arrayList10);
            listItem.put(categoryList.get(10), arrayList11);
            listItem.put(categoryList.get(11), arrayList12);
            listItem.put(categoryList.get(12), arrayList13);
            listItem.put(categoryList.get(13), arrayList14);
            listItem.put(categoryList.get(14), arrayList15);
            listItem.put(categoryList.get(15), arrayList16);
            listItem.put(categoryList.get(16), arrayList17);
            listItem.put(categoryList.get(17), arrayList18);
            listItem.put(categoryList.get(18), arrayList19);
            listItem.put(categoryList.get(19), arrayList20);
            listItem.put(categoryList.get(20), arrayList21);
            listItem.put(categoryList.get(21), arrayList22);
            listItem.put(categoryList.get(22), arrayList23);
            listItem.put(categoryList.get(23), arrayList24);
            listItem.put(categoryList.get(24), arrayList25);
            listItem.put(categoryList.get(25), arrayList26);
            listItem.put(categoryList.get(26), arrayList27);
            listItem.put(categoryList.get(27), arrayList28);
            listItem.put(categoryList.get(28), arrayList29);
            listItem.put(categoryList.get(29), arrayList30);
            listItem.put(categoryList.get(30), arrayList31);
            listItem.put(categoryList.get(31), arrayList32);
            listItem.put(categoryList.get(32), arrayList33);

            ListViewAdapter adapter = new ListViewAdapter(categoryList, listItem, this, title);
            expandableListView.setAdapter(adapter);
        }

        if (title.equals("Kotlin")) {

            ArrayList<String> arrayList1 = new ArrayList<>();
            ArrayList<String> arrayList2 = new ArrayList<>();
            ArrayList<String> arrayList3 = new ArrayList<>();
            ArrayList<String> arrayList4 = new ArrayList<>();
            ArrayList<String> arrayList5 = new ArrayList<>();
            ArrayList<String> arrayList6 = new ArrayList<>();
            ArrayList<String> arrayList7 = new ArrayList<>();
            ArrayList<String> arrayList8 = new ArrayList<>();
            ArrayList<String> arrayList9 = new ArrayList<>();
            ArrayList<String> arrayList10 = new ArrayList<>();
            ArrayList<String> arrayList11 = new ArrayList<>();
            ArrayList<String> arrayList12 = new ArrayList<>();
            ArrayList<String> arrayList13 = new ArrayList<>();
            ArrayList<String> arrayList14 = new ArrayList<>();
            ArrayList<String> arrayList15 = new ArrayList<>();
            ArrayList<String> arrayList16 = new ArrayList<>();
            ArrayList<String> arrayList17 = new ArrayList<>();
            ArrayList<String> arrayList18 = new ArrayList<>();
            ArrayList<String> arrayList19 = new ArrayList<>();
            ArrayList<String> arrayList20 = new ArrayList<>();

            //---------------Topics-----------------------------

            categoryList.add("Wikipedia");
            categoryList.add("Kotlin Tutorial");
            categoryList.add("Control Flow");
            categoryList.add("Function");
            categoryList.add("Array");
            categoryList.add("String");
            categoryList.add("Exception Handling");
            categoryList.add("Null Safety");
            categoryList.add("Collections");
            categoryList.add("Annotations");
            categoryList.add("Reflection");
            categoryList.add("Kotlin OOPs");
            categoryList.add("Ranges");
            categoryList.add("Java Interoperability");
            categoryList.add("Regex");
            categoryList.add("Android Startup");
            categoryList.add("Compiler");
            categoryList.add("Programs");
            categoryList.add("StackOverflow");
            categoryList.add("Video Tutorials");

            //--------------------Sub topics-----------------------------

            arrayList1.add("Introduction");

            arrayList2.add("Kotlin Tutorial");
            arrayList2.add("Environment Setup");
            arrayList2.add("Hello World Program");
            arrayList2.add("First Program Concept");
            arrayList2.add("Environment Setup (IDE)");
            arrayList2.add("First Program (IDE)");
            arrayList2.add("Kotlin Variable");
            arrayList2.add("Kotlin Data Type");
            arrayList2.add("Kotlin Type Conversion");
            arrayList2.add("Kotlin Operator");
            arrayList2.add("Kotlin Input/Output");
            arrayList2.add("Kotlin Comment");

            arrayList3.add("Kotlin if Expression");
            arrayList3.add("Kotlin when Expression");
            arrayList3.add("Kotlin for Loop");
            arrayList3.add("Kotlin while Loop");
            arrayList3.add("Kotlin Do while Loop");
            arrayList3.add("Return and Jump");
            arrayList3.add("Continue Structure");

            arrayList4.add("Kotlin Function");
            arrayList4.add("Recursion Function");
            arrayList4.add("Default and Named Argument");
            arrayList4.add("Kotlin Lambdas");
            arrayList4.add("Higher order Function");
            arrayList4.add("Kotlin Inline Function");

            arrayList5.add("Kotlin Array");

            arrayList6.add("Kotlin String");

            arrayList7.add("Exception Handling");
            arrayList7.add("Kotlin Try Catch");
            arrayList7.add("Multiple Catch Block");
            arrayList7.add("Nested Try Block");
            arrayList7.add("Kotlin Finally Block");
            arrayList7.add("Kotlin Throw Keyword");

            arrayList8.add("Nullable Non Nullable Types");
            arrayList8.add("Kotlin Smart Cast");
            arrayList8.add("Unsafe and Safe Cast");
            arrayList8.add("Kotlin Elvis Operator");

            arrayList9.add("Mutable Array");
            arrayList9.add("Kotlin Collections");
            arrayList9.add("List: listOf()");
            arrayList9.add("mutableListOf()");
            arrayList9.add("Kotlin ArrayList");
            arrayList9.add("arrayListOf()");
            arrayList9.add("Map: mapOf()");
            arrayList9.add("Kotlin HashMap");
            arrayList9.add("hashMapOf()");
            arrayList9.add("mutableMapOf()");
            arrayList9.add("Set: setOf()");
            arrayList9.add("mutableSetOf()");
            arrayList9.add("hashSetOf()");

            arrayList10.add("Kotlin Annotations");

            arrayList11.add("Kotlin Reflection");

            arrayList12.add("Class and Object");
            arrayList12.add("Nested and Inner Class");
            arrayList12.add("Kotlin Constructor");
            arrayList12.add("Visibility Modifier");
            arrayList12.add("Kotlin Inheritance");
            arrayList12.add("Abstract Class");
            arrayList12.add("Kotlin Interface");
            arrayList12.add("Data Class");
            arrayList12.add("Sealed Class");
            arrayList12.add("Extension Function");
            arrayList12.add("Kotlin Generics");

            arrayList13.add("Integer type range");
            arrayList13.add("Kotlin Working Ranges");
            arrayList13.add("Kotlin Utility Function");

            arrayList14.add("Calling Java code from Kotlin");
            arrayList14.add("Calling Kotlin code from Java");

            arrayList15.add("Regular Expressions Introduction");
            arrayList15.add("Regex patterns");

            arrayList16.add("Install Android Studio");
            arrayList16.add("Hello World App");

            arrayList17.add("Kotlin Online Compiler");

            arrayList18.add("Kotlin Programs");

            arrayList19.add("QnAs");

            arrayList20.add("Complete Kotlin in 1 Video (4+ hour) : English");
            arrayList20.add("Complete Kotlin in 1 Video (5+ hour) : Hindi");
            arrayList20.add("Playlist : 64 Videos : English");
            arrayList20.add("Playlist : 41 Videos : Hindi");

            //-----------------------------------------------------------------------

            listItem.put(categoryList.get(0), arrayList1);
            listItem.put(categoryList.get(1), arrayList2);
            listItem.put(categoryList.get(2), arrayList3);
            listItem.put(categoryList.get(3), arrayList4);
            listItem.put(categoryList.get(4), arrayList5);
            listItem.put(categoryList.get(5), arrayList6);
            listItem.put(categoryList.get(6), arrayList7);
            listItem.put(categoryList.get(7), arrayList8);
            listItem.put(categoryList.get(8), arrayList9);
            listItem.put(categoryList.get(9), arrayList10);
            listItem.put(categoryList.get(10), arrayList11);
            listItem.put(categoryList.get(11), arrayList12);
            listItem.put(categoryList.get(12), arrayList13);
            listItem.put(categoryList.get(13), arrayList14);
            listItem.put(categoryList.get(14), arrayList15);
            listItem.put(categoryList.get(15), arrayList16);
            listItem.put(categoryList.get(16), arrayList17);
            listItem.put(categoryList.get(17), arrayList18);
            listItem.put(categoryList.get(18), arrayList19);
            listItem.put(categoryList.get(19), arrayList20);

            ListViewAdapter adapter = new ListViewAdapter(categoryList, listItem, this, title);
            expandableListView.setAdapter(adapter);
        }

        if (title.equals("Python")) {

            ArrayList<String> arrayList1 = new ArrayList<>();
            ArrayList<String> arrayList2 = new ArrayList<>();
            ArrayList<String> arrayList3 = new ArrayList<>();
            ArrayList<String> arrayList4 = new ArrayList<>();
            ArrayList<String> arrayList5 = new ArrayList<>();
            ArrayList<String> arrayList6 = new ArrayList<>();
            ArrayList<String> arrayList7 = new ArrayList<>();
            ArrayList<String> arrayList8 = new ArrayList<>();
            ArrayList<String> arrayList9 = new ArrayList<>();
            ArrayList<String> arrayList10 = new ArrayList<>();
            ArrayList<String> arrayList11 = new ArrayList<>();
            ArrayList<String> arrayList12 = new ArrayList<>();
            ArrayList<String> arrayList13 = new ArrayList<>();
            ArrayList<String> arrayList14 = new ArrayList<>();
            ArrayList<String> arrayList15 = new ArrayList<>();

            //---------------Topics-----------------------------

            categoryList.add("Wikipedia");
            categoryList.add("Python Tutorial");
            categoryList.add("Python OOPs");
            categoryList.add("Python MySQL");
            categoryList.add("Python MongoDB");
            categoryList.add("Python SQLite");
            categoryList.add("Python Questions");
            categoryList.add("Python Tkinter (GUI)");
            categoryList.add("Python Web Blocker");
            categoryList.add("Python MCQ");
            categoryList.add("Related Tutorials");
            categoryList.add("Compiler");
            categoryList.add("Programs");
            categoryList.add("StackOverflow");
            categoryList.add("Video Tutorials");

            //--------------------Sub topics-----------------------------

            arrayList1.add("Introduction");

            arrayList2.add("Python Tutorial");
            arrayList2.add("Python Features");
            arrayList2.add("Python History");
            arrayList2.add("Python Applications");
            arrayList2.add("Python Install");
            arrayList2.add("Python Example");
            arrayList2.add("Python Variables");
            arrayList2.add("Python Data Types");
            arrayList2.add("Python Keywords");
            arrayList2.add("Python Literals");
            arrayList2.add("Python Operators");
            arrayList2.add("Python Comments");
            arrayList2.add("Python If else");
            arrayList2.add("Python Loops");
            arrayList2.add("Python For Loop");
            arrayList2.add("Python While Loop");
            arrayList2.add("Python Break");
            arrayList2.add("Python Continue");
            arrayList2.add("Python Pass");
            arrayList2.add("Python Strings");
            arrayList2.add("Python Lists");
            arrayList2.add("Python Tuples");
            arrayList2.add("Python List Vs Tuple");
            arrayList2.add("Python Sets"); //
            arrayList2.add("Python Dictionary");
            arrayList2.add("Python Functions");
            arrayList2.add("Python Built-in Functions");
            arrayList2.add("Python Lambda Functions");
            arrayList2.add("Python Files I/O");
            arrayList2.add("Python Modules");
            arrayList2.add("Python Exceptions");
            arrayList2.add("Python Date");
            arrayList2.add("Python Regex");
            arrayList2.add("Python Sending Email");
            arrayList2.add("Read CSV File");
            arrayList2.add("Write CSV File");
            arrayList2.add("Read Excel File");
            arrayList2.add("Write Excel File");
            arrayList2.add("Python Assert");
            arrayList2.add("Python List Comprehension");
            arrayList2.add("Python Collection Module");
            arrayList2.add("Python Math Module");
            arrayList2.add("Python OS Module");
            arrayList2.add("Python Random Module");
            arrayList2.add("Python Statistics Module");
            arrayList2.add("Python Sys Module");
            arrayList2.add("Python IDEs");
            arrayList2.add("Python Arrays");
            arrayList2.add("Command Line Arguments");
            arrayList2.add("Python Magic Method");
            arrayList2.add("Python Stack & Queue");
            arrayList2.add("PySpark MLlib");
            arrayList2.add("Python Decorator");
            arrayList2.add("Python Generators");
            arrayList2.add("Web Scraping Using Python");
            arrayList2.add("Python JSON");
            arrayList2.add("Python Itertools");
            arrayList2.add("Python Multiprocessing");

            arrayList3.add("Python OOPs Concepts");
            arrayList3.add("Python Object Class");
            arrayList3.add("Python Constructors");
            arrayList3.add("Python Inheritance");

            arrayList4.add("Environment Setup");
            arrayList4.add("Database Connection");
            arrayList4.add("Creating New Database");
            arrayList4.add("Creating Tables");
            arrayList4.add("Insert Operation");
            arrayList4.add("Read Operation");
            arrayList4.add("Update Operation");
            arrayList4.add("Join Operation");
            arrayList4.add("Performing Transactions");

            arrayList5.add("Python MongoDB");

            arrayList6.add("Python SQLite");

            arrayList7.add("How to install Python in Windows");
            arrayList7.add("How to reverse a string in Python");
            arrayList7.add("How to read CSV file in Python");
            arrayList7.add("How to run Python Program");
            arrayList7.add("How to take input in Python");
            arrayList7.add("How to convert list to string in Python");
            arrayList7.add("How to append element in the list");
            arrayList7.add("How to compare two lists in Python");
            arrayList7.add("How to convert int to string in Python");
            arrayList7.add("How to create a dictionary in Python");
            arrayList7.add("How to create a virtual environment in Python");
            arrayList7.add("How to declare a variable in Python");
            arrayList7.add("How to install matplotlib in Python");
            arrayList7.add("How to install OpenCV in Python");
            arrayList7.add("How to print in same line in Python");
            arrayList7.add("How to read JSON file in Python");
            arrayList7.add("How to read a text file in Python");
            arrayList7.add("How to use for loop in Python");
            arrayList7.add("Is Python scripting language");
            arrayList7.add("How long does it take to learn Python");
            arrayList7.add("How to concatenate two strings in Python");
            arrayList7.add("How to connect Database in Python");
            arrayList7.add("How to convert list to dictionary in Python");
            arrayList7.add("How to declare a global variable in Python");
            arrayList7.add("How to reverse a number in Python");
            arrayList7.add("What is an object in Python");
            arrayList7.add("Which is the fastest implementation of Python");
            arrayList7.add("How to clear Python shell");
            arrayList7.add("How to create a DataFrames in Python");
            arrayList7.add("How to develop a game in Python");
            arrayList7.add("How to install Tkinter in Python");
            arrayList7.add("How to plot a graph in Python");
            arrayList7.add("How to print pattern in Python");
            arrayList7.add("How to remove an element from a list in Python");
            arrayList7.add("How to Round number in Python");
            arrayList7.add("How to sort a dictionary in Python");
            arrayList7.add("Strong Number in Python");
            arrayList7.add("How to Convert Text to Speech in Python");
            arrayList7.add("Bubble Sort in Python");
            arrayList7.add("Logging in Python");
            arrayList7.add("Insertion Sort in Python");
            arrayList7.add("Binary Search in Python");
            arrayList7.add("Linear Search in Python");
            arrayList7.add("Python vs Scala");
            arrayList7.add("Queue in Python");
            arrayList7.add("Stack in Python");
            arrayList7.add("Heap Sort in Python");
            arrayList7.add("Palindrome program in python");
            arrayList7.add("Program of Cumulative sum in python");
            arrayList7.add("Merge Sort in Python");
            arrayList7.add("Python Matrix");
            arrayList7.add("Python Unit Testing");
            arrayList7.add("Forensics & Virtualization");
            arrayList7.add("GCD of two number in python");
            arrayList7.add("Python Program to generate a Random String");
            arrayList7.add("How to One Hot Encode Sequence Data in Python");
            arrayList7.add("How to write square root in Python");
            arrayList7.add("Pointer in Python");
            arrayList7.add("Python 2D array");
            arrayList7.add("Python Memory Management");
            arrayList7.add("Python Libraries for Data Visualization");

            arrayList8.add("Python Tkinter");
            arrayList8.add("Tkinter Button");
            arrayList8.add("Tkinter Canvas");
            arrayList8.add("Tkinter Checkbutton");
            arrayList8.add("Tkinter Entry");
            arrayList8.add("Tkinter Frame");
            arrayList8.add("Tkinter Label");
            arrayList8.add("Tkinter Listbox");
            arrayList8.add("Tkinter Menubutton");
            arrayList8.add("Tkinter Menu");
            arrayList8.add("Tkinter Message");
            arrayList8.add("Tkinter Radiobutton");
            arrayList8.add("Tkinter Scale");
            arrayList8.add("Tkinter Scrollbar");
            arrayList8.add("Tkinter Text");
            arrayList8.add("Tkinter Toplevel");
            arrayList8.add("Tkinter Spinbox");
            arrayList8.add("Tkinter PanedWindow");
            arrayList8.add("Tkinter LabelFrame");
            arrayList8.add("Tkinter MessageBox");

            arrayList9.add("Introduction");
            arrayList9.add("Building Python Script");
            arrayList9.add("Script Deployment on Linux");
            arrayList9.add("Script Deployment on Windows");

            arrayList10.add("Python MCQ");

            arrayList11.add("NumPy Tutorial");
            arrayList11.add("Django Tutorial");
            arrayList11.add("Flask Tutorial");
            arrayList11.add("Pandas Tutorial");
            arrayList11.add("Pytorch Tutorial");
            arrayList11.add("Pygame Tutorial");
            arrayList11.add("Matplotlib Tutorial");
            arrayList11.add("OpenCV Tutorial");
            arrayList11.add("Openpyxl Tutorial");
            arrayList11.add("Python CGI");

            arrayList12.add("Online Python Compiler");

            arrayList13.add("Python programs");

            arrayList14.add("QnAs");

            arrayList15.add("Complete Python in 1 Video (6+ hour) : English");
            arrayList15.add("Complete Python in 1 Video (11+ hour) : Hindi");
            arrayList15.add("Playlist : 221 Videos : English");
            arrayList15.add("Playlist : 129 Videos : Hindi");

            //-----------------------------------------------------------------------

            listItem.put(categoryList.get(0), arrayList1);
            listItem.put(categoryList.get(1), arrayList2);
            listItem.put(categoryList.get(2), arrayList3);
            listItem.put(categoryList.get(3), arrayList4);
            listItem.put(categoryList.get(4), arrayList5);
            listItem.put(categoryList.get(5), arrayList6);
            listItem.put(categoryList.get(6), arrayList7);
            listItem.put(categoryList.get(7), arrayList8);
            listItem.put(categoryList.get(8), arrayList9);
            listItem.put(categoryList.get(9), arrayList10);
            listItem.put(categoryList.get(10), arrayList11);
            listItem.put(categoryList.get(11), arrayList12);
            listItem.put(categoryList.get(12), arrayList13);
            listItem.put(categoryList.get(13), arrayList14);
            listItem.put(categoryList.get(14), arrayList15);

            ListViewAdapter adapter = new ListViewAdapter(categoryList, listItem, this, title);
            expandableListView.setAdapter(adapter);
        }

        if (title.equals("Android")) {

            ArrayList<String> arrayList1 = new ArrayList<>();
            ArrayList<String> arrayList2 = new ArrayList<>();
            ArrayList<String> arrayList3 = new ArrayList<>();
            ArrayList<String> arrayList4 = new ArrayList<>();
            ArrayList<String> arrayList5 = new ArrayList<>();
            ArrayList<String> arrayList6 = new ArrayList<>();
            ArrayList<String> arrayList7 = new ArrayList<>();
            ArrayList<String> arrayList8 = new ArrayList<>();
            ArrayList<String> arrayList9 = new ArrayList<>();
            ArrayList<String> arrayList10 = new ArrayList<>();
            ArrayList<String> arrayList11 = new ArrayList<>();
            ArrayList<String> arrayList12 = new ArrayList<>();
            ArrayList<String> arrayList13 = new ArrayList<>();
            ArrayList<String> arrayList14 = new ArrayList<>();
            ArrayList<String> arrayList15 = new ArrayList<>();
            ArrayList<String> arrayList16 = new ArrayList<>();
            ArrayList<String> arrayList17 = new ArrayList<>();
            ArrayList<String> arrayList18 = new ArrayList<>();
            ArrayList<String> arrayList19 = new ArrayList<>();
            ArrayList<String> arrayList20 = new ArrayList<>();
            ArrayList<String> arrayList21 = new ArrayList<>();
            ArrayList<String> arrayList22 = new ArrayList<>();
            ArrayList<String> arrayList23 = new ArrayList<>();
            ArrayList<String> arrayList24 = new ArrayList<>();
            ArrayList<String> arrayList25 = new ArrayList<>();
            ArrayList<String> arrayList26 = new ArrayList<>();
            ArrayList<String> arrayList27 = new ArrayList<>();
            ArrayList<String> arrayList28 = new ArrayList<>();
            ArrayList<String> arrayList29 = new ArrayList<>();
            ArrayList<String> arrayList30 = new ArrayList<>();
            ArrayList<String> arrayList31 = new ArrayList<>();
            ArrayList<String> arrayList32 = new ArrayList<>();

            //---------------Topics-----------------------------

            categoryList.add("Wikipedia");
            categoryList.add("Android documentation");
            categoryList.add("Android Tutorial");
            categoryList.add("Android Widgets");
            categoryList.add("Activity and Intents");
            categoryList.add("Android Fragments");
            categoryList.add("Android Menu");
            categoryList.add("Android Service");
            categoryList.add("Android AlarmManager");
            categoryList.add("Android Storage");
            categoryList.add("Android SQLite");
            categoryList.add("XML and JSON");
            categoryList.add("Android Multimedia");
            categoryList.add("Android Speech");
            categoryList.add("Android Telephony");
            categoryList.add("Android Device");
            categoryList.add("Camera Tutorial");
            categoryList.add("Sensor Tutorial");
            categoryList.add("Android Graphics");
            categoryList.add("Android Animation");
            categoryList.add("Android Web Service");
            categoryList.add("Google Map");
            categoryList.add("Adding Ads");
            categoryList.add("Android Examples");
            categoryList.add("Android Social");
            categoryList.add("Android Versions");
            categoryList.add("Android Quiz");
            categoryList.add("Interview Questions");
            categoryList.add("StackOverflow");
            categoryList.add("Courses");
            categoryList.add("Video Tutorials");
            categoryList.add("Projects");


            //--------------------Sub topics-----------------------------

            arrayList1.add("Introduction");

            arrayList2.add("Official documentation blog");

            arrayList3.add("Android Introduction");
            arrayList3.add("What is Android");
            arrayList3.add("History and Version");
            arrayList3.add("Android Architecture");
            arrayList3.add("Core Building Blocks");
            arrayList3.add("Android Emulator");
            arrayList3.add("Install Android");
            arrayList3.add("Setup Eclipse");
            arrayList3.add("Hello Android example");
            arrayList3.add("Internal Details");
            arrayList3.add("Dalvik VM");
            arrayList3.add("AndroidManifest.xml");
            arrayList3.add("R.java");
            arrayList3.add("Hide Title Bar");
            arrayList3.add("Screen Orientation");

            arrayList4.add("UI Widgets");
            arrayList4.add("Working with Button");
            arrayList4.add("Toast");
            arrayList4.add("Custom Toast");
            arrayList4.add("ToggleButton");
            arrayList4.add("CheckBox");
            arrayList4.add("Custom CheckBox");
            arrayList4.add("RadioButton");
            arrayList4.add("Dynamic RadioButton");
            arrayList4.add("Custom RadioButton");
            arrayList4.add("AlertDialog");
            arrayList4.add("Spinner");
            arrayList4.add("AutoCompleteTextView");
            arrayList4.add("ListView");
            arrayList4.add("Custom ListView");
            arrayList4.add("RatingBar");
            arrayList4.add("WebView");
            arrayList4.add("SeekBar");
            arrayList4.add("DatePicker");
            arrayList4.add("TimePicker");
            arrayList4.add("Analog and Digital");
            arrayList4.add("ProgressBar");
            arrayList4.add("Vertical ScrollView");
            arrayList4.add("Horizontal ScrollView");
            arrayList4.add("ImageSwitcher");
            arrayList4.add("ImageSlider");
            arrayList4.add("ViewStub");
            arrayList4.add("TabLayout");
            arrayList4.add("TabLayout with FrameLayout");
            arrayList4.add("SearchView");
            arrayList4.add("SearchView on Toolbar");
            arrayList4.add("EditText with TextWatcher");

            arrayList5.add("Activity LifeCycle");
            arrayList5.add("Implicit Intent");
            arrayList5.add("Explicit Intent");
            arrayList5.add("StartActivityForResult");
            arrayList5.add("Share App Data");

            arrayList6.add("Android Fragments");

            arrayList7.add("Option Menu");
            arrayList7.add("Context Menu");
            arrayList7.add("Popup Menu");

            arrayList8.add("Android Service");

            arrayList9.add("Android AlarmManager");

            arrayList10.add("Android Preferences");
            arrayList10.add("Internal Storage");
            arrayList10.add("External Storage");

            arrayList11.add("SQLite Tutorial");
            arrayList11.add("SQLite Spinner");

            arrayList12.add("XML Parsing SAX");
            arrayList12.add("XML Parsing DOM");
            arrayList12.add("XMLPullParser");
            arrayList12.add("JSON Parsing");

            arrayList13.add("MediaPlayer: Audio");
            arrayList13.add("VideoView: Video");
            arrayList13.add("Recording Media");

            arrayList14.add("TextToSpeech1");
            arrayList14.add("TextToSpeech2");

            arrayList15.add("TelephonyManager");
            arrayList15.add("Get Call State");
            arrayList15.add("Get Call State 2");
            arrayList15.add("Simple Caller Talker");
            arrayList15.add("Phone Call");
            arrayList15.add("Send SMS");
            arrayList15.add("Send Email");

            arrayList16.add("Bluetooth Tutorial");
            arrayList16.add("List Paired Devices");
            arrayList16.add("WIFI");

            arrayList17.add("Camera Tutorial");

            arrayList18.add("Sensor Tutorial");

            arrayList19.add("Android Graphics");

            arrayList20.add("Android Animation");

            arrayList21.add("Android Web Service");

            arrayList22.add("Android Google Map");
            arrayList22.add("Current Location");
            arrayList22.add("Search Location");

            arrayList23.add("Android Google Admob");
            arrayList23.add("1) Banner Ads");
            arrayList23.add("2) Interstitial Ads");

            arrayList24.add("QR/Bar Code Scanner");
            arrayList24.add("RSS Feed Reader");
            arrayList24.add("Volley Fetch JSON");
            arrayList24.add("Android Linkify");
            arrayList24.add("Intro Slider");
            arrayList24.add("RecyclerView List");
            arrayList24.add("Swipe Del RecyclerView");
            arrayList24.add("Swipe Refresh Activity");
            arrayList24.add("Volley Library Registration Log-in Log-out");
            arrayList24.add("Network Connectivity Services");
            arrayList24.add("Firebase Authentication - Google Login");
            arrayList24.add("Android Notification");
            arrayList24.add("Using Google reCAPTCHA");

            arrayList25.add("Integrating Google Sign-In");
            arrayList25.add("Integrating LinkedIn");
            arrayList25.add("Integrating Twitter");

            arrayList26.add("Android Versions");
            arrayList26.add("Android KitKat");
            arrayList26.add("Android Lollipop");
            arrayList26.add("Android Marshmallow");
            arrayList26.add("Android Nougat");
            arrayList26.add("Android Oreo");
            arrayList26.add("Android Pie");
            arrayList26.add("Android 10");

            arrayList27.add("Android Quiz");

            arrayList28.add("Interview Questions");

            arrayList29.add("QnAs");

            arrayList30.add("Android courses in Java & Kotlin");

            arrayList31.add("Learn Android in 1 video (8+ hour) : English || Java");
            arrayList31.add("Learn Android in 1 video (11+ hour) : Hindi || Java");
            arrayList31.add("Playlist 126 Videos : English || Java");
            arrayList31.add("Playlist : 34 Videos : Hindi || Java");
            arrayList31.add("Checkout another tutorials");

            arrayList32.add("Instagram clone app || Java");
            arrayList32.add("Chat app || Java");
            arrayList32.add("Whatsapp clone app || Java");
            arrayList32.add("Music player app || Java");
            arrayList32.add("Quiz App || Kotlin");

            //-----------------------------------------------------------------------

            listItem.put(categoryList.get(0), arrayList1);
            listItem.put(categoryList.get(1), arrayList2);
            listItem.put(categoryList.get(2), arrayList3);
            listItem.put(categoryList.get(3), arrayList4);
            listItem.put(categoryList.get(4), arrayList5);
            listItem.put(categoryList.get(5), arrayList6);
            listItem.put(categoryList.get(6), arrayList7);
            listItem.put(categoryList.get(7), arrayList8);
            listItem.put(categoryList.get(8), arrayList9);
            listItem.put(categoryList.get(9), arrayList10);
            listItem.put(categoryList.get(10), arrayList11);
            listItem.put(categoryList.get(11), arrayList12);
            listItem.put(categoryList.get(12), arrayList13);
            listItem.put(categoryList.get(13), arrayList14);
            listItem.put(categoryList.get(14), arrayList15);
            listItem.put(categoryList.get(15), arrayList16);
            listItem.put(categoryList.get(16), arrayList17);
            listItem.put(categoryList.get(17), arrayList18);
            listItem.put(categoryList.get(18), arrayList19);
            listItem.put(categoryList.get(19), arrayList20);
            listItem.put(categoryList.get(20), arrayList21);
            listItem.put(categoryList.get(21), arrayList22);
            listItem.put(categoryList.get(22), arrayList23);
            listItem.put(categoryList.get(23), arrayList24);
            listItem.put(categoryList.get(24), arrayList25);
            listItem.put(categoryList.get(25), arrayList26);
            listItem.put(categoryList.get(26), arrayList27);
            listItem.put(categoryList.get(27), arrayList28);
            listItem.put(categoryList.get(28), arrayList29);
            listItem.put(categoryList.get(29), arrayList30);
            listItem.put(categoryList.get(30), arrayList31);
            listItem.put(categoryList.get(31), arrayList32);

            ListViewAdapter adapter = new ListViewAdapter(categoryList, listItem, this, title);
            expandableListView.setAdapter(adapter);
        }
    }
}