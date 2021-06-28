package com.pns.allprogramminglanguages;

public class Url {

    private static final String[][] Curls = new String[22][500];

    private static final String[][] CPlusUrls = new String[25][500];

    private static final String[][] JavaUrls = new String[33][500];

    private static final String[][] KotlinUrls = new String[20][500];

    private static final String[][] PythonUrls = new String[15][500];

    private static final String[][] AndroidUrls = new String[32][500];

    public static String getUrl(int groupPosition, int childPosition, String title) {

        initializeCUrls();
        initializeCPlusUrls();
        initializeJavaUrls();
        initializeKotlinUrls();
        initializePythonUrls();
        initializeAndroidUrls();

        switch (title) {
            case "C":

                return Curls[groupPosition][childPosition];

            case "C++":

                return CPlusUrls[groupPosition][childPosition];

            case "Java":

                return JavaUrls[groupPosition][childPosition];

            case "Kotlin":

                return KotlinUrls[groupPosition][childPosition];

            case "Python":

                return PythonUrls[groupPosition][childPosition];

            case "Android":

                return AndroidUrls[groupPosition][childPosition];

        }

        return "";
    }

    private static void initializeCUrls() {

        Curls[0][0] = "https://en.wikipedia.org/wiki/C_(programming_language)";

        Curls[1][0] = "https://www.javatpoint.com/c-programming-language-tutorial";
        Curls[1][1] = "https://www.javatpoint.com/history-of-c-language";
        Curls[1][2] = "https://www.javatpoint.com/features-of-c-language";
        Curls[1][3] = "https://www.javatpoint.com/how-to-install-c";
        Curls[1][4] = "https://www.javatpoint.com/first-c-program";
        Curls[1][5] = "https://www.javatpoint.com/compilation-process-in-c";
        Curls[1][6] = "https://www.javatpoint.com/printf-scanf";
        Curls[1][7] = "https://www.javatpoint.com/variables-in-c";
        Curls[1][8] = "https://www.javatpoint.com/data-types-in-c";
        Curls[1][9] = "https://www.javatpoint.com/keywords-in-c";
        Curls[1][10] = "https://www.javatpoint.com/c-identifiers";
        Curls[1][11] = "https://www.javatpoint.com/c-operators";
        Curls[1][12] = "https://www.javatpoint.com/comments-in-c";
        Curls[1][13] = "https://www.javatpoint.com/c-format-specifier";
        Curls[1][14] = "https://www.javatpoint.com/escape-sequence-in-c";
        Curls[1][15] = "https://www.javatpoint.com/ascii-value-in-c";
        Curls[1][16] = "https://www.javatpoint.com/constants-in-c";
        Curls[1][17] = "https://www.javatpoint.com/literals-in-c";
        Curls[1][18] = "https://www.javatpoint.com/tokens-in-c";
        Curls[1][19] = "https://www.javatpoint.com/c-boolean";
        Curls[1][20] = "https://www.javatpoint.com/static-in-c";
        Curls[1][21] = "https://www.javatpoint.com/programming-errors-in-c";
        Curls[1][22] = "https://www.javatpoint.com/compile-time-vs-runtime";
        Curls[1][23] = "https://www.javatpoint.com/conditional-operator-in-c";
        Curls[1][24] = "https://www.javatpoint.com/bitwise-operator-in-c";
        Curls[1][25] = "https://www.javatpoint.com/2s-complement-in-c";
        Curls[1][26] = "https://www.javatpoint.com/test/c-fundamental-1";

        Curls[2][0] = "https://www.javatpoint.com/c-if-else";
        Curls[2][1] = "https://www.javatpoint.com/c-switch";
        Curls[2][2] = "https://www.javatpoint.com/if-else-vs-switch";
        Curls[2][3] = "https://www.javatpoint.com/c-loop";
        Curls[2][4] = "https://www.javatpoint.com/do-while-loop-in-c";
        Curls[2][5] = "https://www.javatpoint.com/while-loop-in-c";
        Curls[2][6] = "https://www.javatpoint.com/for-loop-in-c";
        Curls[2][7] = "https://www.javatpoint.com/nested-loops-in-c";
        Curls[2][8] = "https://www.javatpoint.com/infinite-loop-in-c";
        Curls[2][9] = "https://www.javatpoint.com/c-break";
        Curls[2][10] = "https://www.javatpoint.com/c-continue";
        Curls[2][11] = "https://www.javatpoint.com/c-goto";
        Curls[2][12] = "https://www.javatpoint.com/type-casting-in-c";
        Curls[2][13] = "https://www.javatpoint.com/test/c-control-statements-1";

        Curls[3][0] = "https://www.javatpoint.com/functions-in-c";
        Curls[3][1] = "https://www.javatpoint.com/call-by-value-and-call-by-reference-in-c";
        Curls[3][2] = "https://www.javatpoint.com/recursion-in-c";
        Curls[3][3] = "https://www.javatpoint.com/storage-classes-in-c";
        Curls[3][4] = "https://www.javatpoint.com/test/c-functions-1";

        Curls[4][0] = "https://www.javatpoint.com/c-array";
        Curls[4][1] = "https://www.javatpoint.com/two-dimensional-array-in-c";
        Curls[4][2] = "https://www.javatpoint.com/return-an-array-in-c";
        Curls[4][3] = "https://www.javatpoint.com/passing-array-to-function-in-c";
        Curls[4][4] = "https://www.javatpoint.com/test/c-array-1";

        Curls[5][0] = "https://www.javatpoint.com/c-pointers";
        Curls[5][1] = "https://www.javatpoint.com/c-pointer-to-pointer";
        Curls[5][2] = "https://www.javatpoint.com/pointer-arithmetic-in-c";
        Curls[5][3] = "https://www.javatpoint.com/dangling-pointers-in-c";
        Curls[5][4] = "https://www.javatpoint.com/size-of-operator-in-c";
        Curls[5][5] = "https://www.javatpoint.com/const-pointer-in-c";
        Curls[5][6] = "https://www.javatpoint.com/void-pointer-in-c";
        Curls[5][7] = "https://www.javatpoint.com/c-dereference-pointer";
        Curls[5][8] = "https://www.javatpoint.com/null-pointer-in-c";
        Curls[5][9] = "https://www.javatpoint.com/c-function-pointer";
        Curls[5][10] = "https://www.javatpoint.com/function-pointer-as-argument-in-c";
        Curls[5][11] = "https://www.javatpoint.com/test/c-pointers-1";

        Curls[6][0] = "https://www.javatpoint.com/dynamic-memory-allocation-in-c";

        Curls[7][0] = "https://www.javatpoint.com/c-strings";
        Curls[7][1] = "https://www.javatpoint.com/c-gets-puts";
        Curls[7][2] = "https://www.javatpoint.com/c-string-functions";
        Curls[7][3] = "https://www.javatpoint.com/c-strlen";
        Curls[7][4] = "https://www.javatpoint.com/c-strcpy";
        Curls[7][5] = "https://www.javatpoint.com/c-strcat";
        Curls[7][6] = "https://www.javatpoint.com/c-strcmp";
        Curls[7][7] = "https://www.javatpoint.com/c-strrev";
        Curls[7][8] = "https://www.javatpoint.com/c-strlwr";
        Curls[7][9] = "https://www.javatpoint.com/c-strupr";
        Curls[7][10] = "https://www.javatpoint.com/c-strstr";
        Curls[7][11] = "https://www.javatpoint.com/test/c-string-1";

        Curls[8][0] = "https://www.javatpoint.com/c-math";

        Curls[9][0] = "https://www.javatpoint.com/structure-in-c";
        Curls[9][1] = "https://www.javatpoint.com/typedef-in-c";
        Curls[9][2] = "https://www.javatpoint.com/array-of-structures-in-c";
        Curls[9][3] = "https://www.javatpoint.com/nested-structure-in-c";
        Curls[9][4] = "https://www.javatpoint.com/structure-padding-in-c";
        Curls[9][5] = "https://www.javatpoint.com/c-union";
        Curls[9][6] = "https://www.javatpoint.com/test/c-structure-union-enums-1";

        Curls[10][0] = "https://www.javatpoint.com/file-handling-in-c";
        Curls[10][1] = "https://www.javatpoint.com/fprintf-fscanf-in-c";
        Curls[10][2] = "https://www.javatpoint.com/fputc-fgetc-in-c";
        Curls[10][3] = "https://www.javatpoint.com/fputs-fgets-in-c";
        Curls[10][4] = "https://www.javatpoint.com/fseek-in-c";
        Curls[10][5] = "https://www.javatpoint.com/rewind-in-c";
        Curls[10][6] = "https://www.javatpoint.com/ftell-in-c";

        Curls[11][0] = "https://www.javatpoint.com/c-preprocessor";
        Curls[11][1] = "https://www.javatpoint.com/c-macros";
        Curls[11][2] = "https://www.javatpoint.com/c-preprocessor-include";
        Curls[11][3] = "https://www.javatpoint.com/c-preprocessor-define";
        Curls[11][4] = "https://www.javatpoint.com/c-preprocessor-undef";
        Curls[11][5] = "https://www.javatpoint.com/c-preprocessor-ifdef";
        Curls[11][6] = "https://www.javatpoint.com/c-preprocessor-ifndef";
        Curls[11][7] = "https://www.javatpoint.com/c-preprocessor-if";
        Curls[11][8] = "https://www.javatpoint.com/c-preprocessor-else";
        Curls[11][9] = "https://www.javatpoint.com/c-preprocessor-error";
        Curls[11][10] = "https://www.javatpoint.com/c-preprocessor-pragma";
        Curls[11][11] = "https://www.javatpoint.com/test/c-preprocessor-1";

        Curls[12][0] = "https://www.javatpoint.com/command-line-arguments-in-c";

        Curls[13][0] = "https://www.javatpoint.com/c-expressions";
        Curls[13][1] = "https://www.javatpoint.com/c-data-segments";
        Curls[13][2] = "https://www.javatpoint.com/flow-of-c-program";
        Curls[13][3] = "https://www.javatpoint.com/classification-of-programming-languages";
        Curls[13][4] = "https://www.javatpoint.com/enum-in-c";

        Curls[14][0] = "https://www.javatpoint.com/test/c-programming";

        Curls[15][0] = "https://www.javatpoint.com/c-language-mcq";

        Curls[16][0] = "https://www.tutorialspoint.com/cprogramming/cprogramming_interview_questions.htm";
        Curls[16][1] = "https://www.javatpoint.com/c-interview-questions";

        Curls[17][0] = "https://www.programiz.com/c-programming/online-compiler/";

        Curls[18][0] = "http://geeksquiz.com/c-program-to-print-numbers-from-1-to-n-without-using-semicolon/";
        Curls[18][1] = "https://www.geeksforgeeks.org/to-find-sum-of-two-numbers-without-using-any-operator/";
        Curls[18][2] = "https://www.geeksforgeeks.org/how-will-you-show-memory-representation-of-c-variables/";
        Curls[18][3] = "https://www.geeksforgeeks.org/condition-to-print-helloword/";
        Curls[18][4] = "https://www.geeksforgeeks.org/changeadd-only-one-character-and-print-exactly-20-times/";
        Curls[18][5] = "https://www.geeksforgeeks.org/how-can-we-sum-the-digits-of-a-given-number-in-single-statement/";
        Curls[18][6] = "https://www.geeksforgeeks.org/what-is-the-best-way-in-c-to-convert-a-number-to-a-string/";
        Curls[18][7] = "https://www.geeksforgeeks.org/calculate-logn-in-one-line/";
        Curls[18][8] = "https://www.geeksforgeeks.org/even-or-odd-without-using-condtional-statement/";
        Curls[18][9] = "https://www.geeksforgeeks.org/how-will-you-print-numbers-from-1-to-200-without-using-loop/";
        Curls[18][10] = "https://www.geeksforgeeks.org/how-can-we-sum-the-digits-of-a-given-number-in-single-statement/";
        Curls[18][11] = "https://www.geeksforgeeks.org/write-a-c-program-to-print-geeks-for-geeks-without-using-a-semicolon/";
        Curls[18][12] = "https://www.geeksforgeeks.org/write-a-c-function-to-round-floating-point-numbers/";
        Curls[18][13] = "https://www.geeksforgeeks.org/implement-your-own-sizeof/";
        Curls[18][14] = "https://www.geeksforgeeks.org/count-set-bits-floating-point-number/";
        Curls[18][15] = "https://www.geeksforgeeks.org/c-puzzle/";
        Curls[18][16] = "https://www.geeksforgeeks.org/find-length-string-without-strlen-loop/";
        Curls[18][17] = "https://www.geeksforgeeks.org/implement-itoa/";
        Curls[18][18] = "https://www.geeksforgeeks.org/write-a-c-program-that-doesnt-terminate-when-ctrlc-is-pressed/";
        Curls[18][19] = "https://www.geeksforgeeks.org/how-to-measure-time-taken-by-a-program-in-c/";
        Curls[18][20] = "https://www.geeksforgeeks.org/print-long-int-number-c-using-putchar/";
        Curls[18][21] = "https://www.geeksforgeeks.org/convert-floating-point-number-string/";
        Curls[18][22] = "https://www.geeksforgeeks.org/write-running-c-code-without-main/";
        Curls[18][23] = "https://www.geeksforgeeks.org/write-memcpy/";
        Curls[18][24] = "https://www.geeksforgeeks.org/c-program-print-characters-without-using-format-specifiers/";
        Curls[18][25] = "https://www.geeksforgeeks.org/c-program-print-string-without-quote-singe-double-program/";
        Curls[18][26] = "https://www.geeksforgeeks.org/execute-else-statements-cc-simultaneously/";
        Curls[18][27] = "https://www.geeksforgeeks.org/print-hello-world-c-without-using-header-file/";
        Curls[18][28] = "https://www.geeksforgeeks.org/use-scanf-not-printf/";

        Curls[19][0] = "https://www.programiz.com/c-programming/examples/print-sentence";
        Curls[19][1] = "https://www.programiz.com/c-programming/examples/print-integer";
        Curls[19][2] = "https://www.programiz.com/c-programming/examples/add-numbers";
        Curls[19][3] = "https://www.programiz.com/c-programming/examples/product-numbers";
        Curls[19][4] = "https://www.programiz.com/c-programming/examples/ASCII-value-character";
        Curls[19][5] = "https://www.programiz.com/c-programming/examples/remainder-quotient";
        Curls[19][6] = "https://www.programiz.com/c-programming/examples/sizeof-operator-example";
        Curls[19][7] = "https://www.programiz.com/c-programming/examples/keyword-long";
        Curls[19][8] = "https://www.programiz.com/c-programming/examples/swapping";
        Curls[19][9] = "https://www.programiz.com/c-programming/examples/even-odd";
        Curls[19][10] = "https://www.programiz.com/c-programming/examples/vowel-consonant";
        Curls[19][11] = "https://www.programiz.com/c-programming/examples/largest-number-three";
        Curls[19][12] = "https://www.programiz.com/c-programming/examples/quadratic-roots";
        Curls[19][13] = "https://www.programiz.com/c-programming/examples/leap-year";
        Curls[19][14] = "https://www.programiz.com/c-programming/examples/negative-positive-zero";
        Curls[19][15] = "https://www.programiz.com/c-programming/examples/alphabet";
        Curls[19][16] = "https://www.programiz.com/c-programming/examples/sum-natural-numbers";
        Curls[19][17] = "https://www.programiz.com/c-programming/examples/factorial";
        Curls[19][18] = "https://www.programiz.com/c-programming/examples/multiplication-table";
        Curls[19][19] = "https://www.programiz.com/c-programming/examples/fibonacci-series";////////////////
        Curls[19][20] = "https://www.programiz.com/c-programming/examples/hcf-gcd";
        Curls[19][21] = "https://www.programiz.com/c-programming/examples/lcm";
        Curls[19][22] = "https://www.programiz.com/c-programming/examples/display-alphabets";
        Curls[19][23] = "https://www.programiz.com/c-programming/examples/digits-count";
        Curls[19][24] = "https://www.programiz.com/c-programming/examples/reverse-number";
        Curls[19][25] = "https://www.programiz.com/c-programming/examples/power-number";
        Curls[19][26] = "https://www.programiz.com/c-programming/examples/palindrome-number";
        Curls[19][27] = "https://www.programiz.com/c-programming/examples/prime-number";
        Curls[19][28] = "https://www.programiz.com/c-programming/examples/prime-number-intervals";
        Curls[19][29] = "https://www.programiz.com/c-programming/examples/check-armstrong-number";
        Curls[19][30] = "https://www.programiz.com/c-programming/examples/armstrong-number-interval";
        Curls[19][31] = "https://www.programiz.com/c-programming/examples/factors-number";
        Curls[19][32] = "https://www.programiz.com/c-programming/examples/calculator-switch-case";
        Curls[19][33] = "https://www.programiz.com/c-programming/examples/prime-interval-function";
        Curls[19][34] = "https://www.programiz.com/c-programming/examples/prime-armstrong-function";
        Curls[19][35] = "https://www.programiz.com/c-programming/examples/sum-prime-numbers";
        Curls[19][36] = "https://www.programiz.com/c-programming/examples/natural-number-sum-recursion";
        Curls[19][37] = "https://www.programiz.com/c-programming/examples/factorial-recursion";
        Curls[19][38] = "https://www.programiz.com/c-programming/examples/hcf-recursion";
        Curls[19][39] = "https://www.programiz.com/c-programming/examples/binary-decimal-convert";///////////////////////
        Curls[19][40] = "https://www.programiz.com/c-programming/examples/octal-decimal-convert";
        Curls[19][41] = "https://www.programiz.com/c-programming/examples/octal-binary-convert";
        Curls[19][42] = "https://www.programiz.com/c-programming/examples/reverse-sentence-recursion";
        Curls[19][43] = "https://www.programiz.com/c-programming/examples/power-recursion";
        Curls[19][44] = "https://www.programiz.com/c-programming/examples/average-arrays";
        Curls[19][45] = "https://www.programiz.com/c-programming/examples/array-largest-element";
        Curls[19][46] = "https://www.programiz.com/c-programming/examples/standard-deviation";
        Curls[19][47] = "https://www.programiz.com/c-programming/examples/add-matrix";
        Curls[19][48] = "https://www.programiz.com/c-programming/examples/matrix-multiplication";
        Curls[19][49] = "https://www.programiz.com/c-programming/examples/matrix-transpose";
        Curls[19][50] = "https://www.programiz.com/c-programming/examples/matrix-multiplication-function";
        Curls[19][51] = "https://www.programiz.com/c-programming/examples/access-array-pointer";
        Curls[19][52] = "https://www.programiz.com/c-programming/examples/swapping-cyclic-order";
        Curls[19][53] = "https://www.programiz.com/c-programming/examples/dynamic-memory-allocation-largest";
        Curls[19][54] = "https://www.programiz.com/c-programming/examples/frequency-character";
        Curls[19][55] = "https://www.programiz.com/c-programming/examples/vowel-consonant-frequency-string";
        Curls[19][56] = "https://www.programiz.com/c-programming/examples/remove-characters-string";
        Curls[19][57] = "https://www.programiz.com/c-programming/examples/string-length";
        Curls[19][58] = "https://www.programiz.com/c-programming/examples/concatenate-string";
        Curls[19][59] = "https://www.programiz.com/c-programming/examples/string-copy";/////////////
        Curls[19][60] = "https://www.programiz.com/c-programming/examples/lexicographical-order";
        Curls[19][61] = "https://www.programiz.com/c-programming/examples/structure-store-information";
        Curls[19][62] = "https://www.programiz.com/c-programming/examples/inch-feet-structure";
        Curls[19][63] = "https://www.programiz.com/c-programming/examples/complex-number-add";
        Curls[19][64] = "https://www.programiz.com/c-programming/examples/time-structure";
        Curls[19][65] = "https://www.programiz.com/c-programming/examples/information-structure-array";
        Curls[19][66] = "https://www.programiz.com/c-programming/examples/structure-dynamic-memory-allocation";
        Curls[19][67] = "https://www.programiz.com/c-programming/examples/write-file";
        Curls[19][68] = "https://www.programiz.com/c-programming/examples/read-file";
        Curls[19][69] = "https://www.programiz.com/c-programming/examples/source-code-output";
        Curls[19][70] = "https://www.programiz.com/c-programming/examples/pyramid-pattern";

        Curls[20][0] = "https://stackoverflow.com/questions/tagged/c?sort=MostFrequent&edited=true";

        Curls[21][0] = "https://www.youtube.com/watch?v=KJgsSFOSQv0";
        Curls[21][1] = "https://www.youtube.com/watch?v=ZSPZob_1TOk";
        Curls[21][2] = "https://www.youtube.com/watch?v=wKoGImLA2KA&list=PLsyeobzWxl7oBxHp43xQTFrw9f1CDPR6C";
        Curls[21][3] = "https://www.youtube.com/watch?v=EMEvheCVhMk&list=PL7ersPsTyYt2Q-SqZxTA1D-melSfqBRMW";
    }

    private static void initializeCPlusUrls() {

        CPlusUrls[0][0] = "https://en.wikipedia.org/wiki/C%2B%2B";

        CPlusUrls[1][0] = "https://www.javatpoint.com/cpp-tutorial";
        CPlusUrls[1][1] = "https://www.javatpoint.com/c-vs-cpp";
        CPlusUrls[1][2] = "https://www.javatpoint.com/cpp-history";
        CPlusUrls[1][3] = "https://www.javatpoint.com/cpp-features";
        CPlusUrls[1][4] = "https://www.javatpoint.com/cpp-installation";
        CPlusUrls[1][5] = "https://www.javatpoint.com/cpp-program";
        CPlusUrls[1][6] = "https://www.javatpoint.com/cpp-basic-input-output";
        CPlusUrls[1][7] = "https://www.javatpoint.com/cpp-variable";
        CPlusUrls[1][8] = "https://www.javatpoint.com/cpp-data-types";
        CPlusUrls[1][9] = "https://www.javatpoint.com/cpp-keywords";
        CPlusUrls[1][10] = "https://www.javatpoint.com/cpp-operators";
        CPlusUrls[1][11] = "https://www.javatpoint.com/cpp-identifiers";
        CPlusUrls[1][12] = "https://www.javatpoint.com/cpp-expression";

        CPlusUrls[2][0] = "https://www.javatpoint.com/cpp-if-else";
        CPlusUrls[2][1] = "https://www.javatpoint.com/cpp-switch";
        CPlusUrls[2][2] = "https://www.javatpoint.com/cpp-for-loop";
        CPlusUrls[2][3] = "https://www.javatpoint.com/cpp-while-loop";
        CPlusUrls[2][4] = "https://www.javatpoint.com/cpp-do-while-loop";
        CPlusUrls[2][5] = "https://www.javatpoint.com/cpp-break-statement";
        CPlusUrls[2][6] = "https://www.javatpoint.com/cpp-continue-statement";
        CPlusUrls[2][7] = "https://www.javatpoint.com/cpp-goto-statement";
        CPlusUrls[2][8] = "https://www.javatpoint.com/cpp-comments";

        CPlusUrls[3][0] = "https://www.javatpoint.com/cpp-functions";
        CPlusUrls[3][1] = "https://www.javatpoint.com/call-by-value-and-call-by-reference-in-cpp";
        CPlusUrls[3][2] = "https://www.javatpoint.com/cpp-recursion";
        CPlusUrls[3][3] = "https://www.javatpoint.com/cpp-storage-classes";

        CPlusUrls[4][0] = "https://www.javatpoint.com/cpp-arrays";
        CPlusUrls[4][1] = "https://www.javatpoint.com/cpp-passing-array-to-function";
        CPlusUrls[4][2] = "https://www.javatpoint.com/cpp-multidimensional-array";

        CPlusUrls[5][0] = "https://www.javatpoint.com/cpp-pointers";
        CPlusUrls[5][1] = "https://www.javatpoint.com/sizeof-operator-in-cpp";
        CPlusUrls[5][2] = "https://www.javatpoint.com/cpp-array-of-pointers";
        CPlusUrls[5][3] = "https://www.javatpoint.com/cpp-void-pointer";
        CPlusUrls[5][4] = "https://www.javatpoint.com/cpp-references";
        CPlusUrls[5][5] = "https://www.javatpoint.com/cpp-reference-vs-pointer";
        CPlusUrls[5][6] = "https://www.javatpoint.com/function-pointer-in-cpp";
        CPlusUrls[5][7] = "https://www.javatpoint.com/cpp-memory-management";
        CPlusUrls[5][8] = "https://www.javatpoint.com/malloc-vs-new-in-cpp";
        CPlusUrls[5][9] = "https://www.javatpoint.com/free-vs-delete-in-cpp";

        CPlusUrls[6][0] = "https://www.javatpoint.com/cpp-oops-concepts";
        CPlusUrls[6][1] = "https://www.javatpoint.com/cpp-object-and-class";
        CPlusUrls[6][2] = "https://www.javatpoint.com/cpp-constructor";
        CPlusUrls[6][3] = "https://www.javatpoint.com/cpp-copy-constructor";
        CPlusUrls[6][4] = "https://www.javatpoint.com/cpp-destructor";
        CPlusUrls[6][5] = "https://www.javatpoint.com/cpp-this-pointer";
        CPlusUrls[6][6] = "https://www.javatpoint.com/cpp-static";
        CPlusUrls[6][7] = "https://www.javatpoint.com/cpp-structs";
        CPlusUrls[6][8] = "https://www.javatpoint.com/cpp-enumeration";
        CPlusUrls[6][9] = "https://www.javatpoint.com/cpp-friend-function";
        CPlusUrls[6][10] = "https://www.javatpoint.com/cpp-math-functions";

        CPlusUrls[7][0] = "https://www.javatpoint.com/cpp-inheritance";
        CPlusUrls[7][1] = "https://www.javatpoint.com/cpp-aggregation";

        CPlusUrls[8][0] = "https://www.javatpoint.com/cpp-polymorphism";
        CPlusUrls[8][1] = "https://www.javatpoint.com/cpp-overloading";
        CPlusUrls[8][2] = "https://www.javatpoint.com/cpp-function-overriding";
        CPlusUrls[8][3] = "https://www.javatpoint.com/cpp-virtual-function";

        CPlusUrls[9][0] = "https://www.javatpoint.com/interfaces-in-cpp";
        CPlusUrls[9][1] = "https://www.javatpoint.com/data-abstraction-in-cpp";

        CPlusUrls[10][0] = "https://www.javatpoint.com/cpp-namespaces";

        CPlusUrls[11][0] = "https://www.javatpoint.com/cpp-strings";

        CPlusUrls[12][0] = "https://www.javatpoint.com/cpp-exception-handling";
        CPlusUrls[12][1] = "https://www.javatpoint.com/cpp-try-catch";
        CPlusUrls[12][2] = "https://www.javatpoint.com/cpp-user-defined-exceptions";

        CPlusUrls[13][0] = "https://www.javatpoint.com/cpp-templates";

        CPlusUrls[14][0] = "https://www.javatpoint.com/cpp-signal-handling";

        CPlusUrls[15][0] = "https://www.javatpoint.com/cpp-files-and-streams";
        CPlusUrls[15][1] = "https://www.javatpoint.com/cpp-getline";

        CPlusUrls[16][0] = "https://www.javatpoint.com/cpp-vs-csharp";
        CPlusUrls[16][1] = "https://www.javatpoint.com/cpp-int-to-string";
        CPlusUrls[16][2] = "https://www.javatpoint.com/cpp-vs-python";

        CPlusUrls[17][0] = "https://www.javatpoint.com/cpp-stl-components";
        CPlusUrls[17][1] = "https://www.javatpoint.com/cpp-vector";
        CPlusUrls[17][2] = "https://www.javatpoint.com/initialize-vector-in-cpp";
        CPlusUrls[17][3] = "https://www.javatpoint.com/post/cpp-deque";
        CPlusUrls[17][4] = "https://www.javatpoint.com/post/cpp-list";
        CPlusUrls[17][5] = "https://www.javatpoint.com/cpp-set";
        CPlusUrls[17][6] = "https://www.javatpoint.com/cpp-stack";
        CPlusUrls[17][7] = "https://www.javatpoint.com/cpp-queue";
        CPlusUrls[17][8] = "https://www.javatpoint.com/priority-queue-in-cpp";
        CPlusUrls[17][9] = "https://www.javatpoint.com/post/cpp-map";
        CPlusUrls[17][10] = "https://www.javatpoint.com/post/cpp-multimap";
        CPlusUrls[17][11] = "https://www.javatpoint.com/post/cpp-bitset";
        CPlusUrls[17][12] = "https://www.javatpoint.com/cpp-algorithm";


        CPlusUrls[18][0] = "https://www.javatpoint.com/cpp-iterators";
        CPlusUrls[18][1] = "https://www.javatpoint.com/cpp-bidirectional-iterator";
        CPlusUrls[18][2] = "https://www.javatpoint.com/cpp-forward-iterator";
        CPlusUrls[18][3] = "https://www.javatpoint.com/cpp-input-iterator";
        CPlusUrls[18][4] = "https://www.javatpoint.com/cpp-output-iterator";

        CPlusUrls[19][0] = "https://www.javatpoint.com/cpp-mcq";

        CPlusUrls[20][0] = "https://www.javatpoint.com/cpp-interview-questions";
        CPlusUrls[20][1] = "https://hackr.io/blog/cpp-interview-questions";
        CPlusUrls[20][2] = "https://www.tutorialspoint.com/cplusplus/cpp_interview_questions.htm";

        CPlusUrls[21][0] = "https://www.programiz.com/cpp-programming/online-compiler/";

        CPlusUrls[22][0] = "https://www.javatpoint.com/fibonacci-series-in-cpp";
        CPlusUrls[22][1] = "https://www.javatpoint.com/prime-number-program-in-cpp";
        CPlusUrls[22][2] = "https://www.javatpoint.com/palindrome-program-in-cpp";
        CPlusUrls[22][3] = "https://www.javatpoint.com/factorial-program-in-cpp";
        CPlusUrls[22][4] = "https://www.javatpoint.com/armstrong-number-in-cpp";
        CPlusUrls[22][5] = "https://www.javatpoint.com/sum-of-digits-program-in-cpp";
        CPlusUrls[22][6] = "https://www.javatpoint.com/cpp-program-to-reverse-number";
        CPlusUrls[22][7] = "https://www.javatpoint.com/cpp-program-to-swap-two-numbers-without-third-variable";
        CPlusUrls[22][8] = "https://www.javatpoint.com/matrix-multiplication-in-cpp";
        CPlusUrls[22][9] = "https://www.javatpoint.com/cpp-program-to-convert-decimal-to-binary";
        CPlusUrls[22][10] = "https://www.javatpoint.com/cpp-program-to-convert-number-in-characters";
        CPlusUrls[22][11] = "https://www.javatpoint.com/cpp-program-to-print-alphabet-triangle";
        CPlusUrls[22][12] = "https://www.javatpoint.com/cpp-program-to-print-number-triangle";
        CPlusUrls[22][13] = "https://www.javatpoint.com/cpp-program-to-generate-fibonacci-triangle";
        CPlusUrls[22][14] = "https://www.javatpoint.com/char-array-to-string-in-cpp";
        CPlusUrls[22][15] = "https://www.javatpoint.com/calculator-program-in-cpp";
        CPlusUrls[22][16] = "https://www.javatpoint.com/program-to-convert-infix-to-postfix-expression-in-cpp-using-the-stack-data-structure";
        CPlusUrls[22][17] = "https://www.javatpoint.com/virtual-destructor-in-cpp";

        CPlusUrls[23][0] = "https://stackoverflow.com/questions/tagged/c++?sort=MostFrequent&edited=true";

        CPlusUrls[24][0] = "https://www.youtube.com/watch?v=vLnPwxZdW4Y";
        CPlusUrls[24][1] = "https://www.youtube.com/watch?v=yGB9jhsEsr8";
        CPlusUrls[24][2] = "https://www.youtube.com/watch?v=SQHREey_Yuc&list=PLfVsf4Bjg79Cu5MYkyJ-u4SyQmMhFeC1C";
        CPlusUrls[24][3] = "https://www.youtube.com/watch?v=Iuo9PpGE04Y&list=PLLYz8uHU480j37APNXBdPz7YzAi4XlQUF";
    }

    private static void initializeJavaUrls() {

        JavaUrls[0][0] = "https://en.wikipedia.org/wiki/Java_(programming_language)";

        JavaUrls[1][0] = "https://www.javatpoint.com/java-tutorial";
        JavaUrls[1][1] = "https://www.javatpoint.com/history-of-java";
        JavaUrls[1][2] = "https://www.javatpoint.com/features-of-java";
        JavaUrls[1][3] = "https://www.javatpoint.com/cpp-vs-java";
        JavaUrls[1][4] = "https://www.javatpoint.com/simple-program-of-java";
        JavaUrls[1][5] = "https://www.javatpoint.com/internal-details-of-hello-java-program";
        JavaUrls[1][6] = "https://www.javatpoint.com/how-to-set-path-in-java";
        JavaUrls[1][7] = "https://www.javatpoint.com/difference-between-jdk-jre-and-jvm";
        JavaUrls[1][8] = "https://www.javatpoint.com/jvm-java-virtual-machine";
        JavaUrls[1][9] = "https://www.javatpoint.com/java-variables";
        JavaUrls[1][10] = "https://www.javatpoint.com/java-data-types";
        JavaUrls[1][11] = "https://www.javatpoint.com/unicode-system-in-java";
        JavaUrls[1][12] = "https://www.javatpoint.com/operators-in-java";
        JavaUrls[1][13] = "https://www.javatpoint.com/java-keywords";

        JavaUrls[2][0] = "https://www.javatpoint.com/java-if-else";
        JavaUrls[2][1] = "https://www.javatpoint.com/java-switch";
        JavaUrls[2][2] = "https://www.javatpoint.com/java-for-loop";
        JavaUrls[2][3] = "https://www.javatpoint.com/java-while-loop";
        JavaUrls[2][4] = "https://www.javatpoint.com/java-do-while-loop";
        JavaUrls[2][5] = "https://www.javatpoint.com/java-break";
        JavaUrls[2][6] = "https://www.javatpoint.com/java-continue";
        JavaUrls[2][7] = "https://www.javatpoint.com/java-comments";

        JavaUrls[3][0] = "https://www.javatpoint.com/java-oops-concepts";
        JavaUrls[3][1] = "https://www.javatpoint.com/java-naming-conventions";
        JavaUrls[3][2] = "https://www.javatpoint.com/object-and-class-in-java";
        JavaUrls[3][3] = "https://www.javatpoint.com/method-in-java";
        JavaUrls[3][4] = "https://www.javatpoint.com/java-constructor";
        JavaUrls[3][5] = "https://www.javatpoint.com/static-keyword-in-java";
        JavaUrls[3][6] = "https://www.javatpoint.com/this-keyword";

        JavaUrls[4][0] = "https://www.javatpoint.com/inheritance-in-java";
        JavaUrls[4][1] = "https://www.javatpoint.com/aggregation-in-java";

        JavaUrls[5][0] = "https://www.javatpoint.com/method-overloading-in-java";
        JavaUrls[5][1] = "https://www.javatpoint.com/method-overriding-in-java";
        JavaUrls[5][2] = "https://www.javatpoint.com/covariant-return-type";
        JavaUrls[5][3] = "https://www.javatpoint.com/super-keyword";
        JavaUrls[5][4] = "https://www.javatpoint.com/instance-initializer-block";
        JavaUrls[5][5] = "https://www.javatpoint.com/final-keyword";
        JavaUrls[5][6] = "https://www.javatpoint.com/runtime-polymorphism-in-java";
        JavaUrls[5][7] = "https://www.javatpoint.com/static-binding-and-dynamic-binding";
        JavaUrls[5][8] = "https://www.javatpoint.com/downcasting-with-instanceof-operator";

        JavaUrls[6][0] = "https://www.javatpoint.com/abstract-class-in-java";
        JavaUrls[6][1] = "https://www.javatpoint.com/interface-in-java";
        JavaUrls[6][2] = "https://www.javatpoint.com/difference-between-abstract-class-and-interface";

        JavaUrls[7][0] = "https://www.javatpoint.com/package";
        JavaUrls[7][1] = "https://www.javatpoint.com/access-modifiers";
        JavaUrls[7][2] = "https://www.javatpoint.com/encapsulation";

        JavaUrls[8][0] = "https://www.javatpoint.com/array-in-java";

        JavaUrls[9][0] = "https://www.javatpoint.com/object-class";
        JavaUrls[9][1] = "https://www.javatpoint.com/object-cloning";
        JavaUrls[9][2] = "https://www.javatpoint.com/java-math";
        JavaUrls[9][3] = "https://www.javatpoint.com/wrapper-class-in-java";
        JavaUrls[9][4] = "https://www.javatpoint.com/recursion-in-java";
        JavaUrls[9][5] = "https://www.javatpoint.com/call-by-value-and-call-by-reference-in-java";
        JavaUrls[9][6] = "https://www.javatpoint.com/strictfp-keyword";
        JavaUrls[9][7] = "https://www.javatpoint.com/creating-api-document";
        JavaUrls[9][8] = "https://www.javatpoint.com/command-line-argument";
        JavaUrls[9][9] = "https://www.javatpoint.com/difference-between-object-and-class";
        JavaUrls[9][10] = "https://www.javatpoint.com/method-overloading-vs-method-overriding-in-java";

        JavaUrls[10][0] = "https://www.javatpoint.com/java-string";
        JavaUrls[10][1] = "https://www.javatpoint.com/immutable-string";
        JavaUrls[10][2] = "https://www.javatpoint.com/string-comparison-in-java";
        JavaUrls[10][3] = "https://www.javatpoint.com/string-concatenation-in-java";
        JavaUrls[10][4] = "https://www.javatpoint.com/substring";
        JavaUrls[10][5] = "https://www.javatpoint.com/methods-of-string-class";
        JavaUrls[10][6] = "https://www.javatpoint.com/StringBuffer-class";
        JavaUrls[10][7] = "https://www.javatpoint.com/StringBuilder-class";
        JavaUrls[10][8] = "https://www.javatpoint.com/difference-between-string-and-stringbuffer";
        JavaUrls[10][9] = "https://www.javatpoint.com/difference-between-stringbuffer-and-stringbuilder";
        JavaUrls[10][10] = "https://www.javatpoint.com/how-to-create-immutable-class";
        JavaUrls[10][11] = "https://www.javatpoint.com/understanding-toString()-method";
        JavaUrls[10][12] = "https://www.javatpoint.com/string-tokenizer-in-java";
        JavaUrls[10][13] = "https://www.javatpoint.com/java-string-faqs";
        JavaUrls[10][14] = "https://www.javatpoint.com/directload.jsp?val=88";

        JavaUrls[11][0] = "https://www.javatpoint.com/java-string-charat";
        JavaUrls[11][1] = "https://www.javatpoint.com/java-string-compareto";
        JavaUrls[11][2] = "https://www.javatpoint.com/java-string-concat";
        JavaUrls[11][3] = "https://www.javatpoint.com/java-string-contains";
        JavaUrls[11][4] = "https://www.javatpoint.com/java-string-endswith";
        JavaUrls[11][5] = "https://www.javatpoint.com/java-string-equals";
        JavaUrls[11][6] = "https://www.javatpoint.com/java-string-equalsignorecase";
        JavaUrls[11][7] = "https://www.javatpoint.com/java-string-format";
        JavaUrls[11][8] = "https://www.javatpoint.com/java-string-getbytes";
        JavaUrls[11][9] = "https://www.javatpoint.com/java-string-getchars";
        JavaUrls[11][10] = "https://www.javatpoint.com/java-string-indexof";
        JavaUrls[11][11] = "https://www.javatpoint.com/java-string-intern";
        JavaUrls[11][12] = "https://www.javatpoint.com/java-string-isempty";
        JavaUrls[11][13] = "https://www.javatpoint.com/java-string-join";
        JavaUrls[11][14] = "https://www.javatpoint.com/java-string-lastindexof";
        JavaUrls[11][15] = "https://www.javatpoint.com/java-string-length";
        JavaUrls[11][16] = "https://www.javatpoint.com/java-string-replace";
        JavaUrls[11][17] = "https://www.javatpoint.com/java-string-replaceall";
        JavaUrls[11][18] = "https://www.javatpoint.com/java-string-split";
        JavaUrls[11][19] = "https://www.javatpoint.com/java-string-startswith";
        JavaUrls[11][20] = "https://www.javatpoint.com/java-string-substring";
        JavaUrls[11][21] = "https://www.javatpoint.com/java-string-tochararray";
        JavaUrls[11][22] = "https://www.javatpoint.com/java-string-tolowercase";
        JavaUrls[11][23] = "https://www.javatpoint.com/java-string-touppercase";
        JavaUrls[11][24] = "https://www.javatpoint.com/java-string-trim";
        JavaUrls[11][25] = "https://www.javatpoint.com/java-string-valueof";

        JavaUrls[12][0] = "https://www.javatpoint.com/java-regex";

        JavaUrls[13][0] = "https://www.javatpoint.com/exception-handling-in-java";
        JavaUrls[13][1] = "https://www.javatpoint.com/try-catch-block";
        JavaUrls[13][2] = "https://www.javatpoint.com/multiple-catch-block-in-java";
        JavaUrls[13][3] = "https://www.javatpoint.com/nested-try-block";
        JavaUrls[13][4] = "https://www.javatpoint.com/finally-block-in-exception-handling";
        JavaUrls[13][5] = "https://www.javatpoint.com/throw-keyword";
        JavaUrls[13][6] = "https://www.javatpoint.com/exception-propagation";
        JavaUrls[13][7] = "https://www.javatpoint.com/throws-keyword-and-difference-between-throw-and-throws";
        JavaUrls[13][8] = "https://www.javatpoint.com/difference-between-throw-and-throws-in-java";
        JavaUrls[13][9] = "https://www.javatpoint.com/difference-between-final-finally-and-finalize";
        JavaUrls[13][10] = "https://www.javatpoint.com/exception-handling-with-method-overriding";
        JavaUrls[13][11] = "https://www.javatpoint.com/custom-exception";
        JavaUrls[13][12] = "https://www.javatpoint.com/directload.jsp?val=89";
        JavaUrls[13][13] = "https://www.javatpoint.com/directload.jsp?val=96";
        JavaUrls[13][14] = "https://www.javatpoint.com/directload.jsp?val=101";

        JavaUrls[14][0] = "https://www.javatpoint.com/java-inner-class";
        JavaUrls[14][1] = "https://www.javatpoint.com/member-inner-class";
        JavaUrls[14][2] = "https://www.javatpoint.com/anonymous-inner-class";
        JavaUrls[14][3] = "https://www.javatpoint.com/local-inner-class";
        JavaUrls[14][4] = "https://www.javatpoint.com/static-nested-class";
        JavaUrls[14][5] = "https://www.javatpoint.com/nested-interface";

        JavaUrls[15][0] = "https://www.javatpoint.com/multithreading-in-java";
        JavaUrls[15][1] = "https://www.javatpoint.com/life-cycle-of-a-thread";
        JavaUrls[15][2] = "https://www.javatpoint.com/creating-thread";
        JavaUrls[15][3] = "https://www.javatpoint.com/thread-scheduler-in-java";
        JavaUrls[15][4] = "https://www.javatpoint.com/sleep()-method";
        JavaUrls[15][5] = "https://www.javatpoint.com/can-we-start-a-thread-twice";
        JavaUrls[15][6] = "https://www.javatpoint.com/what-if-we-call-run()-method-directly";
        JavaUrls[15][7] = "https://www.javatpoint.com/join()-method";
        JavaUrls[15][8] = "https://www.javatpoint.com/naming-a-thread";
        JavaUrls[15][9] = "https://www.javatpoint.com/priority-of-a-thread";
        JavaUrls[15][10] = "https://www.javatpoint.com/daemon-thread";
        JavaUrls[15][11] = "https://www.javatpoint.com/java-thread-pool";
        JavaUrls[15][12] = "https://www.javatpoint.com/threadgroup-in-java";
        JavaUrls[15][13] = "https://www.javatpoint.com/ShutdownHook-thread";
        JavaUrls[15][14] = "https://www.javatpoint.com/multitasking-in-multithreading";
        JavaUrls[15][15] = "https://www.javatpoint.com/Garbage-Collection";
        JavaUrls[15][16] = "https://www.javatpoint.com/java-runtime-class";
        JavaUrls[15][17] = "https://www.javatpoint.com/directload.jsp?val=90";
        JavaUrls[15][18] = "https://www.javatpoint.com/directload.jsp?val=91";

        JavaUrls[16][0] = "https://www.javatpoint.com/synchronization-in-java";
        JavaUrls[16][1] = "https://www.javatpoint.com/synchronized-block-example";
        JavaUrls[16][2] = "https://www.javatpoint.com/static-synchronization-example";
        JavaUrls[16][3] = "https://www.javatpoint.com/deadlock-in-java";
        JavaUrls[16][4] = "https://www.javatpoint.com/inter-thread-communication-example";
        JavaUrls[16][5] = "https://www.javatpoint.com/interrupting-a-thread";
        JavaUrls[16][6] = "https://www.javatpoint.com/reentrant-monitor-in-java";

        JavaUrls[17][0] = "https://www.javatpoint.com/java-io";
        JavaUrls[17][1] = "https://www.javatpoint.com/java-fileoutputstream-class";
        JavaUrls[17][2] = "https://www.javatpoint.com/java-fileinputstream-class";
        JavaUrls[17][3] = "https://www.javatpoint.com/java-bufferedoutputstream-class";
        JavaUrls[17][4] = "https://www.javatpoint.com/java-bufferedinputstream-class";
        JavaUrls[17][5] = "https://www.javatpoint.com/java-sequenceinputstream-class";
        JavaUrls[17][6] = "https://www.javatpoint.com/java-bytearrayoutputstream-class";
        JavaUrls[17][7] = "https://www.javatpoint.com/java-bytearrayinputstream-class";
        JavaUrls[17][8] = "https://www.javatpoint.com/java-dataoutputstream-class";
        JavaUrls[17][9] = "https://www.javatpoint.com/java-datainputstream-class";
        JavaUrls[17][10] = "https://www.javatpoint.com/java-filteroutputstream-class";
        JavaUrls[17][11] = "https://www.javatpoint.com/java-filterinputstream-class";
        JavaUrls[17][12] = "https://www.javatpoint.com/java-objectstream-class";
        JavaUrls[17][13] = "https://www.javatpoint.com/java-objectstreamfield-class";
        JavaUrls[17][14] = "https://www.javatpoint.com/java-console-class";
        JavaUrls[17][15] = "https://www.javatpoint.com/java-filepermission-class";
        JavaUrls[17][16] = "https://www.javatpoint.com/java-writer-class";
        JavaUrls[17][17] = "https://www.javatpoint.com/java-reader-class";
        JavaUrls[17][18] = "https://www.javatpoint.com/java-filewriter-class";
        JavaUrls[17][19] = "https://www.javatpoint.com/java-filereader-class";
        JavaUrls[17][20] = "https://www.javatpoint.com/java-bufferedwriter-class";
        JavaUrls[17][21] = "https://www.javatpoint.com/java-bufferedreader-class";
        JavaUrls[17][22] = "https://www.javatpoint.com/java-chararrayreader-class";
        JavaUrls[17][23] = "https://www.javatpoint.com/java-chararraywriter-class";
        JavaUrls[17][24] = "https://www.javatpoint.com/java-printstream-class";
        JavaUrls[17][25] = "https://www.javatpoint.com/java-printwriter-class";
        JavaUrls[17][26] = "https://www.javatpoint.com/java-outputstreamwriter-class";
        JavaUrls[17][27] = "https://www.javatpoint.com/java-inputstreamreader-class";
        JavaUrls[17][28] = "https://www.javatpoint.com/java-pushbackinputstream-class";
        JavaUrls[17][29] = "https://www.javatpoint.com/java-pushbackreader-class";
        JavaUrls[17][30] = "https://www.javatpoint.com/java-stringwriter-class";
        JavaUrls[17][31] = "https://www.javatpoint.com/java-stringreader-class";
        JavaUrls[17][32] = "https://www.javatpoint.com/java-pipedwriter-class";
        JavaUrls[17][33] = "https://www.javatpoint.com/java-pipedreader-class";
        JavaUrls[17][34] = "https://www.javatpoint.com/java-filterwriter-class";
        JavaUrls[17][35] = "https://www.javatpoint.com/java-filterreader-class";
        JavaUrls[17][36] = "https://www.javatpoint.com/java-file-class";
        JavaUrls[17][37] = "https://www.javatpoint.com/java-filedescriptor-class";
        JavaUrls[17][38] = "https://www.javatpoint.com/java-randomaccessfile-class";
        JavaUrls[17][39] = "https://www.javatpoint.com/Scanner-class";

        JavaUrls[18][0] = "https://www.javatpoint.com/serialization-in-java";
        JavaUrls[18][1] = "https://www.javatpoint.com/transient-keyword";

        JavaUrls[19][0] = "https://www.javatpoint.com/java-awt";
        JavaUrls[19][1] = "https://www.javatpoint.com/event-handling-in-java";
        JavaUrls[19][2] = "https://www.javatpoint.com/java-awt-button";
        JavaUrls[19][3] = "https://www.javatpoint.com/java-awt-label";
        JavaUrls[19][4] = "https://www.javatpoint.com/java-awt-textfield";
        JavaUrls[19][5] = "https://www.javatpoint.com/java-awt-textarea";
        JavaUrls[19][6] = "https://www.javatpoint.com/java-awt-checkbox";
        JavaUrls[19][7] = "https://www.javatpoint.com/java-awt-checkboxgroup";
        JavaUrls[19][8] = "https://www.javatpoint.com/java-awt-choice";
        JavaUrls[19][9] = "https://www.javatpoint.com/java-awt-list";
        JavaUrls[19][10] = "https://www.javatpoint.com/java-awt-canvas";
        JavaUrls[19][11] = "https://www.javatpoint.com/java-awt-scrollbar";
        JavaUrls[19][12] = "https://www.javatpoint.com/java-awt-menuitem-and-menu";
        JavaUrls[19][13] = "https://www.javatpoint.com/java-awt-popupmenu";
        JavaUrls[19][14] = "https://www.javatpoint.com/java-awt-panel";
        JavaUrls[19][15] = "https://www.javatpoint.com/java-awt-dialog";
        JavaUrls[19][16] = "https://www.javatpoint.com/java-awt-toolkit";
        JavaUrls[19][17] = "https://www.javatpoint.com/java-actionlistener";
        JavaUrls[19][18] = "https://www.javatpoint.com/java-mouselistener";
        JavaUrls[19][19] = "https://www.javatpoint.com/java-mousemotionlistener";
        JavaUrls[19][20] = "https://www.javatpoint.com/java-itemlistener";
        JavaUrls[19][21] = "https://www.javatpoint.com/java-keylistener";
        JavaUrls[19][22] = "https://www.javatpoint.com/java-windowlistener";
        JavaUrls[19][23] = "https://www.javatpoint.com/java-adapter-classes";
        JavaUrls[19][24] = "https://www.javatpoint.com/java-close-awt-window";

        JavaUrls[20][0] = "https://www.javatpoint.com/java-swing";
        JavaUrls[20][1] = "https://www.javatpoint.com/java-jbutton";
        JavaUrls[20][2] = "https://www.javatpoint.com/java-jlabel";
        JavaUrls[20][3] = "https://www.javatpoint.com/java-jtextfield";
        JavaUrls[20][4] = "https://www.javatpoint.com/java-jtextarea";
        JavaUrls[20][5] = "https://www.javatpoint.com/java-jpasswordfield";
        JavaUrls[20][6] = "https://www.javatpoint.com/java-jcheckbox";
        JavaUrls[20][7] = "https://www.javatpoint.com/java-jradiobutton";
        JavaUrls[20][8] = "https://www.javatpoint.com/java-jcombobox";
        JavaUrls[20][9] = "https://www.javatpoint.com/java-jtable";
        JavaUrls[20][10] = "https://www.javatpoint.com/java-jlist";
        JavaUrls[20][11] = "https://www.javatpoint.com/java-joptionpane";
        JavaUrls[20][12] = "https://www.javatpoint.com/java-jscrollbar";
        JavaUrls[20][13] = "https://www.javatpoint.com/java-jmenuitem-and-jmenu";
        JavaUrls[20][14] = "https://www.javatpoint.com/java-jpopupmenu";
        JavaUrls[20][15] = "https://www.javatpoint.com/java-jcheckboxmenuitem";
        JavaUrls[20][16] = "https://www.javatpoint.com/java-jseparator";
        JavaUrls[20][17] = "https://www.javatpoint.com/java-jprogressbar";
        JavaUrls[20][18] = "https://www.javatpoint.com/java-jtree";
        JavaUrls[20][19] = "https://www.javatpoint.com/java-jcolorchooser";
        JavaUrls[20][20] = "https://www.javatpoint.com/java-jtabbedpane";
        JavaUrls[20][21] = "https://www.javatpoint.com/java-jslider";
        JavaUrls[20][22] = "https://www.javatpoint.com/java-jspinner";
        JavaUrls[20][23] = "https://www.javatpoint.com/java-jdialog";
        JavaUrls[20][24] = "https://www.javatpoint.com/java-jpanel";
        JavaUrls[20][25] = "https://www.javatpoint.com/java-jfilechooser";
        JavaUrls[20][26] = "https://www.javatpoint.com/java-jtogglebutton";
        JavaUrls[20][27] = "https://www.javatpoint.com/java-jtoolbar";
        JavaUrls[20][28] = "https://www.javatpoint.com/java-jviewport";
        JavaUrls[20][29] = "https://www.javatpoint.com/java-jframe";
        JavaUrls[20][30] = "https://www.javatpoint.com/java-jcomponent";
        JavaUrls[20][31] = "https://www.javatpoint.com/java-jlayeredpane";
        JavaUrls[20][32] = "https://www.javatpoint.com/java-jdesktoppane";
        JavaUrls[20][33] = "https://www.javatpoint.com/java-jeditorpane";
        JavaUrls[20][34] = "https://www.javatpoint.com/java-jscrollpane";
        JavaUrls[20][35] = "https://www.javatpoint.com/java-jsplitpane";
        JavaUrls[20][36] = "https://www.javatpoint.com/java-jtextpane";
        JavaUrls[20][37] = "https://www.javatpoint.com/java-jrootpane";
        JavaUrls[20][38] = "https://www.javatpoint.com/how-to-use-tooltip-in-java-swing";
        JavaUrls[20][39] = "https://www.javatpoint.com/how-to-change-titlebar-icon-in-java-awt-swing";
        JavaUrls[20][40] = "https://www.javatpoint.com/how-to-make-an-executable-jar-file-in-java";
        JavaUrls[20][41] = "https://www.javatpoint.com/digital-watch";
        JavaUrls[20][42] = "https://www.javatpoint.com/Graphics-in-swing";
        JavaUrls[20][43] = "https://www.javatpoint.com/Displaying-image-in-swing";

        JavaUrls[21][0] = "https://www.javatpoint.com/notepad";
        JavaUrls[21][1] = "https://www.javatpoint.com/calculator-in-java";
        JavaUrls[21][2] = "https://www.javatpoint.com/ip-finder-in-java";
        JavaUrls[21][3] = "https://www.javatpoint.com/word-count-in-java";
        JavaUrls[21][4] = "https://www.javatpoint.com/url-source-code-generator-in-java";
        JavaUrls[21][5] = "https://www.javatpoint.com/folder-explorer-in-java";
        JavaUrls[21][6] = "https://www.javatpoint.com/Puzzle-Game";
        JavaUrls[21][7] = "https://www.javatpoint.com/Pic-Puzzle-Game";
        JavaUrls[21][8] = "https://www.javatpoint.com/tic-tac-toe-game";
        JavaUrls[21][9] = "https://www.javatpoint.com/online-exam-project-in-java-swing-without-database";

        JavaUrls[22][0] = "https://www.javatpoint.com/java-layout-manager";
        JavaUrls[22][1] = "https://www.javatpoint.com/GridLayout";
        JavaUrls[22][2] = "https://www.javatpoint.com/FlowLayout";
        JavaUrls[22][3] = "https://www.javatpoint.com/BoxLayout";
        JavaUrls[22][4] = "https://www.javatpoint.com/CardLayout";
        JavaUrls[22][5] = "https://www.javatpoint.com/java-gridbaglayout";
        JavaUrls[22][6] = "https://www.javatpoint.com/java-grouplayout";
        JavaUrls[22][7] = "https://www.javatpoint.com/java-springlayout";
        JavaUrls[22][8] = "https://www.javatpoint.com/java-scrollpanelayout";

        JavaUrls[23][0] = "https://www.javatpoint.com/java-applet";
        JavaUrls[23][1] = "https://www.javatpoint.com/Graphics-in-applet";
        JavaUrls[23][2] = "https://www.javatpoint.com/Displaying-image-in-applet";
        JavaUrls[23][3] = "https://www.javatpoint.com/Animation-in-applet";
        JavaUrls[23][4] = "https://www.javatpoint.com/Event-Handling-in-applet";
        JavaUrls[23][5] = "https://www.javatpoint.com/JApplet";
        JavaUrls[23][6] = "https://www.javatpoint.com/Painting-in-applet";
        JavaUrls[23][7] = "https://www.javatpoint.com/Digital-clock-in-applet";
        JavaUrls[23][8] = "https://www.javatpoint.com/Analog-clock-in-applet";
        JavaUrls[23][9] = "https://www.javatpoint.com/Parameter-in-applet";
        JavaUrls[23][10] = "https://www.javatpoint.com/Applet-Communication";

        JavaUrls[24][0] = "https://www.javatpoint.com/java-reflection";
        JavaUrls[24][1] = "https://www.javatpoint.com/new-instance()-method";
        JavaUrls[24][2] = "https://www.javatpoint.com/understanding-javap-tool";
        JavaUrls[24][3] = "https://www.javatpoint.com/creating-javap-tool";
        JavaUrls[24][4] = "https://www.javatpoint.com/creating-appletviewer-tool";
        JavaUrls[24][5] = "https://www.javatpoint.com/how-to-call-private-method-from-another-class-in-java";

        JavaUrls[25][0] = "https://www.javatpoint.com/java-date";
        JavaUrls[25][1] = "https://www.javatpoint.com/java-localdate";
        JavaUrls[25][2] = "https://www.javatpoint.com/java-localtime";
        JavaUrls[25][3] = "https://www.javatpoint.com/java-localdatetime";
        JavaUrls[25][4] = "https://www.javatpoint.com/java-monthday";
        JavaUrls[25][5] = "https://www.javatpoint.com/java-offsettime";
        JavaUrls[25][6] = "https://www.javatpoint.com/java-offsetdatetime";
        JavaUrls[25][7] = "https://www.javatpoint.com/java-clock";
        JavaUrls[25][8] = "https://www.javatpoint.com/java-zoneddatetime";
        JavaUrls[25][9] = "https://www.javatpoint.com/java-zoneid";
        JavaUrls[25][10] = "https://www.javatpoint.com/java-zoneoffset";
        JavaUrls[25][11] = "https://www.javatpoint.com/java-year";
        JavaUrls[25][12] = "https://www.javatpoint.com/java-yearmonth";
        JavaUrls[25][13] = "https://www.javatpoint.com/java-period";
        JavaUrls[25][14] = "https://www.javatpoint.com/java-duration";
        JavaUrls[25][15] = "https://www.javatpoint.com/java-instant";
        JavaUrls[25][16] = "https://www.javatpoint.com/java-dayofweek-enum";
        JavaUrls[25][17] = "https://www.javatpoint.com/java-month-enum";

        JavaUrls[26][0] = "https://www.javatpoint.com/java-string-to-int";
        JavaUrls[26][1] = "https://www.javatpoint.com/java-int-to-string";
        JavaUrls[26][2] = "https://www.javatpoint.com/java-string-to-long";
        JavaUrls[26][3] = "https://www.javatpoint.com/java-long-to-string";
        JavaUrls[26][4] = "https://www.javatpoint.com/java-string-to-float";
        JavaUrls[26][5] = "https://www.javatpoint.com/java-float-to-string";
        JavaUrls[26][6] = "https://www.javatpoint.com/java-string-to-double";
        JavaUrls[26][7] = "https://www.javatpoint.com/java-double-to-string";
        JavaUrls[26][8] = "https://www.javatpoint.com/java-string-to-date";
        JavaUrls[26][9] = "https://www.javatpoint.com/java-date-to-string";
        JavaUrls[26][10] = "https://www.javatpoint.com/java-string-to-char";
        JavaUrls[26][11] = "https://www.javatpoint.com/java-char-to-string";
        JavaUrls[26][12] = "https://www.javatpoint.com/java-string-to-object";
        JavaUrls[26][13] = "https://www.javatpoint.com/java-object-to-string";
        JavaUrls[26][14] = "https://www.javatpoint.com/java-int-to-long";
        JavaUrls[26][15] = "https://www.javatpoint.com/java-long-to-int";
        JavaUrls[26][16] = "https://www.javatpoint.com/java-int-to-double";
        JavaUrls[26][17] = "https://www.javatpoint.com/java-double-to-int";
        JavaUrls[26][18] = "https://www.javatpoint.com/java-char-to-int";
        JavaUrls[26][19] = "https://www.javatpoint.com/java-int-to-char";
        JavaUrls[26][20] = "https://www.javatpoint.com/java-string-to-boolean";
        JavaUrls[26][21] = "https://www.javatpoint.com/java-boolean-to-string";
        JavaUrls[26][22] = "https://www.javatpoint.com/java-date-to-timestamp";
        JavaUrls[26][23] = "https://www.javatpoint.com/java-timestamp-to-date";
        JavaUrls[26][24] = "https://www.javatpoint.com/java-binary-to-decimal";
        JavaUrls[26][25] = "https://www.javatpoint.com/java-decimal-to-binary";
        JavaUrls[26][26] = "https://www.javatpoint.com/java-hex-to-decimal";
        JavaUrls[26][27] = "https://www.javatpoint.com/java-decimal-to-hex";
        JavaUrls[26][28] = "https://www.javatpoint.com/java-octal-to-decimal";
        JavaUrls[26][29] = "https://www.javatpoint.com/java-decimal-to-octal";

        JavaUrls[27][0] = "https://www.javatpoint.com/collections-in-java";
        JavaUrls[27][1] = "https://www.javatpoint.com/java-arraylist";
        JavaUrls[27][2] = "https://www.javatpoint.com/java-linkedlist";
        JavaUrls[27][3] = "https://www.javatpoint.com/difference-between-arraylist-and-linkedlist";
        JavaUrls[27][4] = "https://www.javatpoint.com/java-list";
        JavaUrls[27][5] = "https://www.javatpoint.com/java-hashset";
        JavaUrls[27][6] = "https://www.javatpoint.com/java-linkedhashset";
        JavaUrls[27][7] = "https://www.javatpoint.com/java-treeset";
        JavaUrls[27][8] = "https://www.javatpoint.com/java-priorityqueue";
        JavaUrls[27][9] = "https://www.javatpoint.com/java-deque-arraydeque";
        JavaUrls[27][10] = "https://www.javatpoint.com/java-map";
        JavaUrls[27][11] = "https://www.javatpoint.com/java-hashmap";
        JavaUrls[27][12] = "https://www.javatpoint.com/working-of-hashmap-in-java";
        JavaUrls[27][13] = "https://www.javatpoint.com/java-linkedhashmap";
        JavaUrls[27][14] = "https://www.javatpoint.com/java-treemap";
        JavaUrls[27][15] = "https://www.javatpoint.com/java-hashtable";
        JavaUrls[27][16] = "https://www.javatpoint.com/difference-between-hashmap-and-hashtable";
        JavaUrls[27][17] = "https://www.javatpoint.com/java-enumset";
        JavaUrls[27][18] = "https://www.javatpoint.com/java-enummap";
        JavaUrls[27][19] = "https://www.javatpoint.com/java-collections-class";
        JavaUrls[27][20] = "https://www.javatpoint.com/Sorting-in-collection-framework";
        JavaUrls[27][21] = "https://www.javatpoint.com/Comparable-interface-in-collection-framework";
        JavaUrls[27][22] = "https://www.javatpoint.com/Comparator-interface-in-collection-framework";
        JavaUrls[27][23] = "https://www.javatpoint.com/difference-between-comparable-and-comparator";
        JavaUrls[27][24] = "https://www.javatpoint.com/properties-class-in-java";
        JavaUrls[27][25] = "https://www.javatpoint.com/difference-between-arraylist-and-vector";
        JavaUrls[27][26] = "https://www.javatpoint.com/java-vector";
        JavaUrls[27][27] = "https://www.javatpoint.com/java-stack";
        JavaUrls[27][28] = "https://www.javatpoint.com/directload.jsp?val=92";

        JavaUrls[28][0] = "https://www.javatpoint.com/corejava-interview-questions";

        JavaUrls[29][0] = "https://www.jdoodle.com/online-java-compiler/";

        JavaUrls[30][0] = "https://www.javatpoint.com/java-programs";

        JavaUrls[31][0] = "https://stackoverflow.com/questions/tagged/java?sort=MostFrequent&edited=true";

        JavaUrls[32][0] = "https://www.youtube.com/watch?v=8cm1x4bC610";
        JavaUrls[32][1] = "https://www.youtube.com/watch?v=rV_3Lewxx6o";
        JavaUrls[32][2] = "https://www.youtube.com/watch?v=r59xYe3Vyks&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al";
        JavaUrls[32][3] = "https://www.youtube.com/watch?v=IsLyduxZ9sc&list=PLX9Zi6XTqOKQ7TdRz0QynGIKuMV9Q2H8E";
    }

    private static void initializeKotlinUrls() {

        KotlinUrls[0][0] = "https://en.wikipedia.org/wiki/Kotlin_(programming_language)";

        KotlinUrls[1][0] = "https://www.javatpoint.com/kotlin-tutorial";
        KotlinUrls[1][1] = "https://www.javatpoint.com/kotlin-environment-setup-command-line";
        KotlinUrls[1][2] = "https://www.javatpoint.com/kotlin-hello-world-program-command-line";
        KotlinUrls[1][3] = "https://www.javatpoint.com/kotlin-first-program-concept";
        KotlinUrls[1][4] = "https://www.javatpoint.com/kotlin-environment-setup-ide";
        KotlinUrls[1][5] = "https://www.javatpoint.com/kotlin-first-program-on-ide";
        KotlinUrls[1][6] = "https://www.javatpoint.com/kotlin-variable";
        KotlinUrls[1][7] = "https://www.javatpoint.com/kotlin-data-type";
        KotlinUrls[1][8] = "https://www.javatpoint.com/kotlin-type-conversion";
        KotlinUrls[1][9] = "https://www.javatpoint.com/kotlin-operator";
        KotlinUrls[1][10] = "https://www.javatpoint.com/kotlin-input-output";
        KotlinUrls[1][11] = "https://www.javatpoint.com/kotlin-comment";

        KotlinUrls[2][0] = "https://www.javatpoint.com/kotlin-if-expression";
        KotlinUrls[2][1] = "https://www.javatpoint.com/kotlin-when-expression";
        KotlinUrls[2][2] = "https://www.javatpoint.com/kotlin-for-loop";
        KotlinUrls[2][3] = "https://www.javatpoint.com/kotlin-while-loop";
        KotlinUrls[2][4] = "https://www.javatpoint.com/kotlin-do-while-loop";
        KotlinUrls[2][5] = "https://www.javatpoint.com/kotlin-return-and-jump";
        KotlinUrls[2][6] = "https://www.javatpoint.com/kotlin-continue-structure";

        KotlinUrls[3][0] = "https://www.javatpoint.com/kotlin-function";
        KotlinUrls[3][1] = "https://www.javatpoint.com/kotlin-recursion-function";
        KotlinUrls[3][2] = "https://www.javatpoint.com/kotlin-default-and-named-argument";
        KotlinUrls[3][3] = "https://www.javatpoint.com/kotlin-lambdas";
        KotlinUrls[3][4] = "https://www.javatpoint.com/kotlin-higher-order-function";
        KotlinUrls[3][5] = "https://www.javatpoint.com/kotlin-inline-function";

        KotlinUrls[4][0] = "https://www.javatpoint.com/kotlin-array";

        KotlinUrls[5][0] = "https://www.javatpoint.com/kotlin-string";

        KotlinUrls[6][0] = "https://www.javatpoint.com/kotlin-exception-handling";
        KotlinUrls[6][1] = "https://www.javatpoint.com/kotlin-try-catch";
        KotlinUrls[6][2] = "https://www.javatpoint.com/kotlin-multiple-catch-block";
        KotlinUrls[6][3] = "https://www.javatpoint.com/kotlin-nested-try-block";
        KotlinUrls[6][4] = "https://www.javatpoint.com/kotlin-finally-block";
        KotlinUrls[6][5] = "https://www.javatpoint.com/kotlin-throw-keyword";

        KotlinUrls[7][0] = "https://www.javatpoint.com/kotlin-nullable-and-non-nullable-types";
        KotlinUrls[7][1] = "https://www.javatpoint.com/kotlin-smart-cast";
        KotlinUrls[7][2] = "https://www.javatpoint.com/kotlin-unsafe-and-safe-cast-operator";
        KotlinUrls[7][3] = "https://www.javatpoint.com/kotlin-elvis-operator";

        KotlinUrls[8][0] = "https://www.javatpoint.com/kotlin-mutable-array";
        KotlinUrls[8][1] = "https://www.javatpoint.com/kotlin-collections";
        KotlinUrls[8][2] = "https://www.javatpoint.com/kotlin-list";
        KotlinUrls[8][3] = "https://www.javatpoint.com/kotlin-mutablelist-mutablelistof";
        KotlinUrls[8][4] = "https://www.javatpoint.com/kotlin-arraylist";
        KotlinUrls[8][5] = "https://www.javatpoint.com/kotlin-arraylist-arraylistof";
        KotlinUrls[8][6] = "https://www.javatpoint.com/kotlin-map";
        KotlinUrls[8][7] = "https://www.javatpoint.com/kotlin-hashmap";
        KotlinUrls[8][8] = "https://www.javatpoint.com/kotlin-hashmap-hashmapof";
        KotlinUrls[8][9] = "https://www.javatpoint.com/kotlin-mutablemap";
        KotlinUrls[8][10] = "https://www.javatpoint.com/kotlin-set";
        KotlinUrls[8][11] = "https://www.javatpoint.com/kotlin-mutableset";
        KotlinUrls[8][12] = "https://www.javatpoint.com/kotlin-hashset";

        KotlinUrls[9][0] = "https://www.javatpoint.com/kotlin-annotations";

        KotlinUrls[10][0] = "https://www.javatpoint.com/kotlin-reflection";

        KotlinUrls[11][0] = "https://www.javatpoint.com/kotlin-class-and-object";
        KotlinUrls[11][1] = "https://www.javatpoint.com/kotlin-nested-class-and-inner-class";
        KotlinUrls[11][2] = "https://www.javatpoint.com/kotlin-constructor";
        KotlinUrls[11][3] = "https://www.javatpoint.com/kotlin-visibility-modifier";
        KotlinUrls[11][4] = "https://www.javatpoint.com/kotlin-inheritance";
        KotlinUrls[11][5] = "https://www.javatpoint.com/kotlin-abstract-class";
        KotlinUrls[11][6] = "https://www.javatpoint.com/kotlin-interface";
        KotlinUrls[11][7] = "https://www.javatpoint.com/kotlin-data-class";
        KotlinUrls[11][8] = "https://www.javatpoint.com/kotlin-sealed-class";
        KotlinUrls[11][9] = "https://www.javatpoint.com/kotlin-extension-function";
        KotlinUrls[11][10] = "https://www.javatpoint.com/kotlin-generics";

        KotlinUrls[12][0] = "https://www.javatpoint.com/kotlin-integer-range";
        KotlinUrls[12][1] = "https://www.javatpoint.com/kotlin-working-of-ranges";
        KotlinUrls[12][2] = "https://www.javatpoint.com/kotlin-utility-functions";

        KotlinUrls[13][0] = "https://www.javatpoint.com/kotlin-java-interoperability-calling-java-from-kotlin";
        KotlinUrls[13][1] = "https://www.javatpoint.com/kotlin-java-interoperability-calling-kotlin-from-java";

        KotlinUrls[14][0] = "https://www.javatpoint.com/kotlin-regular-expressions-introduction";
        KotlinUrls[14][1] = "https://www.javatpoint.com/kotlin-regex-pattern";

        KotlinUrls[15][0] = "https://www.javatpoint.com/kotlin-install-android-studio";
        KotlinUrls[15][1] = "https://www.javatpoint.com/kotlin-hello-world-app";

        KotlinUrls[16][0] = "https://play.kotlinlang.org/#eyJ2ZXJzaW9uIjoiMS40LjEwIiwicGxhdGZvcm0iOiJqYXZhIiwiYXJncyI6IiIsImpzQ29kZSI6IiIsIm5vbmVNYXJrZXJzIjp0cnVlLCJ0aGVtZSI6ImlkZWEiLCJjb2RlIjoiLyoqXG4gKiBZb3UgY2FuIGVkaXQsIHJ1biwgYW5kIHNoYXJlIHRoaXMgY29kZS4gXG4gKiBwbGF5LmtvdGxpbmxhbmcub3JnIFxuICovXG5cbmZ1biBtYWluKCkge1xuICAgIHByaW50bG4oXCJIZWxsbywgd29ybGQhISFcIilcbn0ifQ==";

        KotlinUrls[17][0] = "https://www.programiz.com/kotlin-programming/examples";

        KotlinUrls[18][0] = "https://stackoverflow.com/questions/tagged/kotlin?sort=MostFrequent&edited=true";

        KotlinUrls[19][0] = "https://www.youtube.com/watch?v=I6rkwJed-HY";
        KotlinUrls[19][1] = "https://www.youtube.com/watch?v=yV97y7qcMP4";
        KotlinUrls[19][2] = "https://www.youtube.com/watch?v=VEqhzCFmEQI&list=PLlxmoA0rQ-LwgK1JsnMsakYNACYGa1cjR";
        KotlinUrls[19][3] = "https://www.youtube.com/watch?v=NosAkIKgA4Y&list=PLRKyZvuMYSIMW3-rSOGCkPlO1z_IYJy3G";
    }

    private static void initializePythonUrls() {

        PythonUrls[0][0] = "https://en.wikipedia.org/wiki/Python_(programming_language)";

        PythonUrls[1][0]  = "https://www.javatpoint.com/python-tutorial";
        PythonUrls[1][1]  = "https://www.javatpoint.com/python-features";
        PythonUrls[1][2]  = "https://www.javatpoint.com/python-history";
        PythonUrls[1][3]  = "https://www.javatpoint.com/python-applications";
        PythonUrls[1][4]  = "https://www.javatpoint.com/how-to-install-python";
        PythonUrls[1][5]  = "https://www.javatpoint.com/python-example";
        PythonUrls[1][6]  = "https://www.javatpoint.com/python-variables";
        PythonUrls[1][7]  = "https://www.javatpoint.com/python-data-types";
        PythonUrls[1][8]  = "https://www.javatpoint.com/python-keywords";
        PythonUrls[1][9]  = "https://www.javatpoint.com/python-literals";
        PythonUrls[1][10] = "https://www.javatpoint.com/python-operators";
        PythonUrls[1][11] = "https://www.javatpoint.com/python-comments";
        PythonUrls[1][12] = "https://www.javatpoint.com/python-if-else";
        PythonUrls[1][13] = "https://www.javatpoint.com/python-loops";
        PythonUrls[1][14] = "https://www.javatpoint.com/python-for-loop";
        PythonUrls[1][15] = "https://www.javatpoint.com/python-while-loop";
        PythonUrls[1][16] = "https://www.javatpoint.com/python-break";
        PythonUrls[1][17] = "https://www.javatpoint.com/python-continue";
        PythonUrls[1][18] = "https://www.javatpoint.com/python-pass";
        PythonUrls[1][19] = "https://www.javatpoint.com/python-strings";
        PythonUrls[1][20] = "https://www.javatpoint.com/python-lists";
        PythonUrls[1][21] = "https://www.javatpoint.com/python-tuples";
        PythonUrls[1][22] = "https://www.javatpoint.com/python-list-vs-tuple";
        PythonUrls[1][23] = "https://www.javatpoint.com/python-set";
        PythonUrls[1][24] = "https://www.javatpoint.com/python-dictionary";
        PythonUrls[1][25] = "https://www.javatpoint.com/python-functions";
        PythonUrls[1][26] = "https://www.javatpoint.com/python-built-in-functions";
        PythonUrls[1][27] = "https://www.javatpoint.com/python-lambda-functions";
        PythonUrls[1][28] = "https://www.javatpoint.com/python-files-io";
        PythonUrls[1][29] = "https://www.javatpoint.com/python-modules";
        PythonUrls[1][30] = "https://www.javatpoint.com/python-exception-handling";
        PythonUrls[1][31] = "https://www.javatpoint.com/python-date";
        PythonUrls[1][32] = "https://www.javatpoint.com/python-regex";
        PythonUrls[1][33] = "https://www.javatpoint.com/python-sending-email";
        PythonUrls[1][34] = "https://www.javatpoint.com/python-read-csv-file";
        PythonUrls[1][35] = "https://www.javatpoint.com/python-write-csv-file";
        PythonUrls[1][36] = "https://www.javatpoint.com/python-read-excel-file";
        PythonUrls[1][37] = "https://www.javatpoint.com/python-write-excel-file";
        PythonUrls[1][38] = "https://www.javatpoint.com/python-assert-keyword";
        PythonUrls[1][39] = "https://www.javatpoint.com/python-list-comprehension";
        PythonUrls[1][40] = "https://www.javatpoint.com/python-collection-module";
        PythonUrls[1][41] = "https://www.javatpoint.com/python-math-module";
        PythonUrls[1][42] = "https://www.javatpoint.com/python-os-module";
        PythonUrls[1][43] = "https://www.javatpoint.com/python-random-module";
        PythonUrls[1][44] = "https://www.javatpoint.com/python-statistics-module";
        PythonUrls[1][45] = "https://www.javatpoint.com/python-sys-module";
        PythonUrls[1][46] = "https://www.javatpoint.com/python-ides";
        PythonUrls[1][47] = "https://www.javatpoint.com/python-arrays";
        PythonUrls[1][48] = "https://www.javatpoint.com/python-command-line-arguments";
        PythonUrls[1][49] = "https://www.javatpoint.com/python-magic-method";
        PythonUrls[1][50] = "https://www.javatpoint.com/python-stack-and-queue";
        PythonUrls[1][51] = "https://www.javatpoint.com/pyspark-mllib";
        PythonUrls[1][52] = "https://www.javatpoint.com/python-decorator";
        PythonUrls[1][53] = "https://www.javatpoint.com/python-generators";
        PythonUrls[1][54] = "https://www.javatpoint.com/web-scraping-using-python";
        PythonUrls[1][55] = "https://www.javatpoint.com/python-json";
        PythonUrls[1][56] = "https://www.javatpoint.com/python-itertools";
        PythonUrls[1][57] = "https://www.javatpoint.com/python-multiprocessing";

        PythonUrls[2][0] = "https://www.javatpoint.com/python-oops-concepts";
        PythonUrls[2][1] = "https://www.javatpoint.com/python-objects-classes";
        PythonUrls[2][2] = "https://www.javatpoint.com/python-constructors";
        PythonUrls[2][3] = "https://www.javatpoint.com/inheritance-in-python";

        PythonUrls[3][0] = "https://www.javatpoint.com/python-mysql-environment-setup";
        PythonUrls[3][1] = "https://www.javatpoint.com/python-mysql-database-connection";
        PythonUrls[3][2] = "https://www.javatpoint.com/python-mysql-creating-new-database";
        PythonUrls[3][3] = "https://www.javatpoint.com/python-mysql-creating-tables";
        PythonUrls[3][4] = "https://www.javatpoint.com/python-mysql-insert-operation";
        PythonUrls[3][5] = "https://www.javatpoint.com/python-mysql-read-operation";
        PythonUrls[3][6] = "https://www.javatpoint.com/python-mysql-update-operation";
        PythonUrls[3][7] = "https://www.javatpoint.com/python-mysql-join-operation";
        PythonUrls[3][8] = "https://www.javatpoint.com/python-mysql-performing-transactions";

        PythonUrls[4][0] = "https://www.javatpoint.com/python-mongodb";

        PythonUrls[5][0] = "https://www.javatpoint.com/python-sqlite";

        PythonUrls[6][0]  = "https://www.javatpoint.com/how-to-install-python-in-windows";
        PythonUrls[6][1]  = "https://www.javatpoint.com/how-to-reverse-a-string-in-python";
        PythonUrls[6][2]  = "https://www.javatpoint.com/how-to-read-csv-file-in-python";
        PythonUrls[6][3]  = "https://www.javatpoint.com/how-to-run-python-program";
        PythonUrls[6][4]  = "https://www.javatpoint.com/how-to-take-input-in-python";
        PythonUrls[6][5]  = "https://www.javatpoint.com/how-to-convert-list-to-string-in-python";
        PythonUrls[6][6]  = "https://www.javatpoint.com/how-to-append-element-in-the-list";
        PythonUrls[6][7]  = "https://www.javatpoint.com/how-to-compare-two-lists-in-python";
        PythonUrls[6][8]  = "https://www.javatpoint.com/how-to-convert-int-to-string-in-python";
        PythonUrls[6][9]  = "https://www.javatpoint.com/how-to-create-a-dictionary-in-python";
        PythonUrls[6][10] = "https://www.javatpoint.com/how-to-create-a-virtual-environment-in-python";
        PythonUrls[6][11] = "https://www.javatpoint.com/how-to-declare-a-variable-in-python";
        PythonUrls[6][12] = "https://www.javatpoint.com/how-to-install-matplotlib-in-python";
        PythonUrls[6][13] = "https://www.javatpoint.com/how-to-install-opencv-in-python";
        PythonUrls[6][14] = "https://www.javatpoint.com/how-to-print-in-same-line-in-python";
        PythonUrls[6][15] = "https://www.javatpoint.com/how-to-read-json-file-in-python";
        PythonUrls[6][16] = "https://www.javatpoint.com/how-to-read-a-text-file-in-python";
        PythonUrls[6][17] = "https://www.javatpoint.com/how-to-use-for-loop-in-python";
        PythonUrls[6][18] = "https://www.javatpoint.com/is-python-scripting-language";
        PythonUrls[6][19] = "https://www.javatpoint.com/how-long-does-it-take-to-learn-python";
        PythonUrls[6][20] = "https://www.javatpoint.com/how-to-concatenate-two-strings-in-python";
        PythonUrls[6][21] = "https://www.javatpoint.com/how-to-connect-database-in-python";
        PythonUrls[6][22] = "https://www.javatpoint.com/how-to-convert-list-to-dictionary-in-python";
        PythonUrls[6][23] = "https://www.javatpoint.com/how-to-declare-a-global-variable-in-python";
        PythonUrls[6][24] = "https://www.javatpoint.com/how-to-reverse-a-number-in-python";
        PythonUrls[6][25] = "https://www.javatpoint.com/what-is-an-object-in-python";
        PythonUrls[6][26] = "https://www.javatpoint.com/which-is-the-fastest-implementation-of-python";
        PythonUrls[6][27] = "https://www.javatpoint.com/how-to-clear-python-shell";
        PythonUrls[6][28] = "https://www.javatpoint.com/how-to-create-a-dataframes-in-python";
        PythonUrls[6][29] = "https://www.javatpoint.com/how-to-develop-a-game-in-python";
        PythonUrls[6][30] = "https://www.javatpoint.com/how-to-install-tkinter-in-python";
        PythonUrls[6][31] = "https://www.javatpoint.com/how-to-plot-a-graph-in-python";
        PythonUrls[6][32] = "https://www.javatpoint.com/how-to-print-pattern-in-python";
        PythonUrls[6][33] = "https://www.javatpoint.com/how-to-remove-an-element-from-a-list-in-python";
        PythonUrls[6][34] = "https://www.javatpoint.com/how-to-round-number-in-python";
        PythonUrls[6][35] = "https://www.javatpoint.com/how-to-sort-a-dictionary-in-python";
        PythonUrls[6][36] = "https://www.javatpoint.com/strong-number-in-python";
        PythonUrls[6][37] = "https://www.javatpoint.com/how-to-convert-text-to-speech-in-python";
        PythonUrls[6][38] = "https://www.javatpoint.com/bubble-sort-in-python";
        PythonUrls[6][39] = "https://www.javatpoint.com/logging-in-python";
        PythonUrls[6][40] = "https://www.javatpoint.com/insertion-sort-in-python";
        PythonUrls[6][41] = "https://www.javatpoint.com/binary-search-in-python";
        PythonUrls[6][42] = "https://www.javatpoint.com/linear-search-in-python";
        PythonUrls[6][43] = "https://www.javatpoint.com/python-vs-scala";
        PythonUrls[6][44] = "https://www.javatpoint.com/queue-in-python";
        PythonUrls[6][45] = "https://www.javatpoint.com/stack-in-python";
        PythonUrls[6][46] = "https://www.javatpoint.com/heap-sort-in-python";
        PythonUrls[6][47] = "https://www.javatpoint.com/palindrome-program-in-python";
        PythonUrls[6][48] = "https://www.javatpoint.com/program-of-cumulative-sum-in-python";
        PythonUrls[6][49] = "https://www.javatpoint.com/merge-sort-in-python";
        PythonUrls[6][50] = "https://www.javatpoint.com/python-matrix";
        PythonUrls[6][51] = "https://www.javatpoint.com/python-unit-testing";
        PythonUrls[6][52] = "https://www.javatpoint.com/python-forensics-and-virtualization";
        PythonUrls[6][53] = "https://www.javatpoint.com/gcd-of-two-number-in-python";
        PythonUrls[6][54] = "https://www.javatpoint.com/python-program-to-generate-a-random-string";
        PythonUrls[6][55] = "https://www.javatpoint.com/how-to-one-hot-encode-sequence-data-in-python";
        PythonUrls[6][56] = "https://www.javatpoint.com/how-to-write-square-root-in-python";
        PythonUrls[6][57] = "https://www.javatpoint.com/pointer-in-python";
        PythonUrls[6][58] = "https://www.javatpoint.com/python-2d-array";
        PythonUrls[6][59] = "https://www.javatpoint.com/python-memory-management";
        PythonUrls[6][60] = "https://www.javatpoint.com/python-libraries-for-data-visualization";

        PythonUrls[7][0]  = "https://www.javatpoint.com/python-tkinter";
        PythonUrls[7][1]  = "https://www.javatpoint.com/python-tkinter-button";
        PythonUrls[7][2]  = "https://www.javatpoint.com/python-tkinter-canvas";
        PythonUrls[7][3]  = "https://www.javatpoint.com/python-tkinter-checkbutton";
        PythonUrls[7][4]  = "https://www.javatpoint.com/python-tkinter-entry";
        PythonUrls[7][5]  = "https://www.javatpoint.com/python-tkinter-frame";
        PythonUrls[7][6]  = "https://www.javatpoint.com/python-tkinter-label";
        PythonUrls[7][7]  = "https://www.javatpoint.com/python-tkinter-listbox";
        PythonUrls[7][8]  = "https://www.javatpoint.com/python-tkinter-menubutton";
        PythonUrls[7][9]  = "https://www.javatpoint.com/python-tkinter-menu";
        PythonUrls[7][10] = "https://www.javatpoint.com/python-tkinter-message";
        PythonUrls[7][11] = "https://www.javatpoint.com/python-tkinter-radiobutton";
        PythonUrls[7][12] = "https://www.javatpoint.com/python-tkinter-scale";
        PythonUrls[7][13] = "https://www.javatpoint.com/python-tkinter-scrollbar";
        PythonUrls[7][14] = "https://www.javatpoint.com/python-tkinter-text";
        PythonUrls[7][15] = "https://www.javatpoint.com/python-tkinter-toplevel";
        PythonUrls[7][16] = "https://www.javatpoint.com/python-tkinter-spinbox";
        PythonUrls[7][17] = "https://www.javatpoint.com/python-tkinter-panedwindow";
        PythonUrls[7][18] = "https://www.javatpoint.com/python-tkinter-labelframe";
        PythonUrls[7][19] = "https://www.javatpoint.com/python-tkinter-messagebox";

        PythonUrls[8][0] = "https://www.javatpoint.com/python-website-blocker";
        PythonUrls[8][1] = "https://www.javatpoint.com/python-website-blocker-building-python-script";
        PythonUrls[8][2] = "https://www.javatpoint.com/python-website-blocker-script-deployment-on-linux";
        PythonUrls[8][3] = "https://www.javatpoint.com/python-website-blocker-script-deployment-on-windows";

        PythonUrls[9][0] = "https://www.javatpoint.com/python-mcq";

        PythonUrls[10][0] = "https://www.javatpoint.com/numpy-tutorial";
        PythonUrls[10][1] = "https://www.javatpoint.com/django-tutorial";
        PythonUrls[10][2] = "https://www.javatpoint.com/flask-tutorial";
        PythonUrls[10][3] = "https://www.javatpoint.com/python-pandas";
        PythonUrls[10][4] = "https://www.javatpoint.com/pytorch";
        PythonUrls[10][5] = "https://www.javatpoint.com/pygame";
        PythonUrls[10][6] = "https://www.javatpoint.com/matplotlib";
        PythonUrls[10][7] = "https://www.javatpoint.com/opencv";
        PythonUrls[10][8] = "https://www.javatpoint.com/python-openpyxl";
        PythonUrls[10][9] = "https://www.javatpoint.com/python-cgi-programming";

        PythonUrls[11][0] = "https://www.tutorialspoint.com/execute_python_online.php";

        PythonUrls[12][0] = "https://www.javatpoint.com/python-programs";

        PythonUrls[13][0] = "https://stackoverflow.com/questions/tagged/python?sort=MostFrequent&edited=true";

        PythonUrls[14][0] = "https://www.youtube.com/watch?v=_uQrJ0TkZlc";
        PythonUrls[14][1] = "https://www.youtube.com/watch?v=gfDE2a7MKjA";
        PythonUrls[14][2] = "https://www.youtube.com/watch?v=41qgdwd3zAg&list=PLS1QulWo1RIaJECMeUT4LFwJ-ghgoSH6n";
        PythonUrls[14][3] = "https://www.youtube.com/watch?v=aqvDTCpNRek&list=PLu0W_9lII9agICnT8t4iYVSZ3eykIAOME";
    }

    private static void initializeAndroidUrls() {

        AndroidUrls[0][0] = "https://en.wikipedia.org/wiki/Android_(operating_system)";

        AndroidUrls[1][0]  = "https://developer.android.com/guide";

        AndroidUrls[2][0]  = "https://www.javatpoint.com/android-tutorial";
        AndroidUrls[2][1]  = "https://www.javatpoint.com/android-what-where-and-why";
        AndroidUrls[2][2]  = "https://www.javatpoint.com/android-history-and-versions";
        AndroidUrls[2][3]  = "https://www.javatpoint.com/android-software-stack";
        AndroidUrls[2][4]  = "https://www.javatpoint.com/android-core-building-blocks";
        AndroidUrls[2][5]  = "https://www.javatpoint.com/android-emulator";
        AndroidUrls[2][6]  = "https://www.javatpoint.com/installing-softwares-for-android";
        AndroidUrls[2][7]  = "https://www.javatpoint.com/how-to-setup-android-for-eclipse-ide";
        AndroidUrls[2][8]  = "https://www.javatpoint.com/hello-android-example";
        AndroidUrls[2][9]  = "https://www.javatpoint.com/internal-details-of-hello-android-example";
        AndroidUrls[2][10] = "https://www.javatpoint.com/dalvik-virtual-machine";
        AndroidUrls[2][11] = "https://www.javatpoint.com/AndroidManifest-xml-file-in-android";
        AndroidUrls[2][12] = "https://www.javatpoint.com/R-java-file-in-android";
        AndroidUrls[2][13] = "https://www.javatpoint.com/android-hide-title-bar-example";
        AndroidUrls[2][14] = "https://www.javatpoint.com/android-screen-orientation-example";

        AndroidUrls[3][0]  = "https://www.javatpoint.com/android-ui-widgets-tutorial";
        AndroidUrls[3][1]  = "https://www.javatpoint.com/android-working-with-button";
        AndroidUrls[3][2]  = "https://www.javatpoint.com/android-toast-example";
        AndroidUrls[3][3]  = "https://www.javatpoint.com/android-custom-toast-example";
        AndroidUrls[3][4]  = "https://www.javatpoint.com/android-togglebutton-example";
        AndroidUrls[3][5]  = "https://www.javatpoint.com/android-checkbox-example";
        AndroidUrls[3][6]  = "https://www.javatpoint.com/android-custom-checkbox";
        AndroidUrls[3][7]  = "https://www.javatpoint.com/android-radiobutton";
        AndroidUrls[3][8]  = "https://www.javatpoint.com/android-dynamic-radiobutton";
        AndroidUrls[3][9]  = "https://www.javatpoint.com/android-custom-radiobutton";
        AndroidUrls[3][10] = "https://www.javatpoint.com/android-alert-dialog-example";
        AndroidUrls[3][11] = "https://www.javatpoint.com/android-spinner-example";
        AndroidUrls[3][12] = "https://www.javatpoint.com/android-autocompletetextview-example";
        AndroidUrls[3][13] = "https://www.javatpoint.com/android-listview-example";
        AndroidUrls[3][14] = "https://www.javatpoint.com/android-custom-listview";
        AndroidUrls[3][15] = "https://www.javatpoint.com/android-rating-bar-example";
        AndroidUrls[3][16] = "https://www.javatpoint.com/android-webview-example";
        AndroidUrls[3][17] = "https://www.javatpoint.com/android-seekbar-example";
        AndroidUrls[3][18] = "https://www.javatpoint.com/android-datepicker-example";
        AndroidUrls[3][19] = "https://www.javatpoint.com/android-timepicker-example";
        AndroidUrls[3][20] = "https://www.javatpoint.com/android-analog-clock-and-digital-clock-example";
        AndroidUrls[3][21] = "https://www.javatpoint.com/android-progressbar-example";
        AndroidUrls[3][22] = "https://www.javatpoint.com/android-scrollview-vertical";
        AndroidUrls[3][23] = "https://www.javatpoint.com/android-scrollview-horizontal";
        AndroidUrls[3][24] = "https://www.javatpoint.com/android-image-switcher";
        AndroidUrls[3][25] = "https://www.javatpoint.com/android-image-slider";
        AndroidUrls[3][26] = "https://www.javatpoint.com/android-viewstub";
        AndroidUrls[3][27] = "https://www.javatpoint.com/android-tablayout";
        AndroidUrls[3][28] = "https://www.javatpoint.com/android-tablayout-with-framelayout";
        AndroidUrls[3][29] = "https://www.javatpoint.com/android-searchview";
        AndroidUrls[3][30] = "https://www.javatpoint.com/android-searchview-on-toolbar";
        AndroidUrls[3][31] = "https://www.javatpoint.com/android-edittext-with-textwatcher";

        AndroidUrls[4][0] = "https://www.javatpoint.com/android-life-cycle-of-activity";
        AndroidUrls[4][1] = "https://www.javatpoint.com/android-intent-tutorial";
        AndroidUrls[4][2] = "https://www.javatpoint.com/android-explicit-intent-example";
        AndroidUrls[4][3] = "https://www.javatpoint.com/android-startactivityforresult-example";
        AndroidUrls[4][4] = "https://www.javatpoint.com/android-share-app-data";

        AndroidUrls[5][0] = "https://www.javatpoint.com/android-fragments";

        AndroidUrls[6][0]  = "https://www.javatpoint.com/android-option-menu-example";
        AndroidUrls[6][1]  = "https://www.javatpoint.com/android-context-menu-example";
        AndroidUrls[6][2]  = "https://www.javatpoint.com/android-popup-menu-example";

        AndroidUrls[7][0]  = "https://www.javatpoint.com/android-service-tutorial";

        AndroidUrls[8][0] = "https://www.javatpoint.com/android-alarmmanager";

        AndroidUrls[9][0] = "https://www.javatpoint.com/android-preferences-example";
        AndroidUrls[9][1] = "https://www.javatpoint.com/android-internal-storage-example";
        AndroidUrls[9][2] = "https://www.javatpoint.com/android-external-storage-example";

        AndroidUrls[10][0] = "https://www.javatpoint.com/android-sqlite-tutorial";
        AndroidUrls[10][1] = "https://www.javatpoint.com/android-sqlite-example-with-spinner";

        AndroidUrls[11][0] = "https://www.javatpoint.com/android-xml-parsing-using-sax-parser";
        AndroidUrls[11][1] = "https://www.javatpoint.com/android-xml-parsing-using-dom-parser";
        AndroidUrls[11][2] = "https://www.javatpoint.com/android-XMLPullParser-tutorial";
        AndroidUrls[11][3] = "https://www.javatpoint.com/android-json-parsing-tutorial";

        AndroidUrls[12][0] = "https://www.javatpoint.com/playing-audio-in-android-example";
        AndroidUrls[12][1] = "https://www.javatpoint.com/playing-video-in-android-example";
        AndroidUrls[12][2] = "https://www.javatpoint.com/android-mediarecorder-example";

        AndroidUrls[13][0] = "https://www.javatpoint.com/android-texttospeech-tutorial";
        AndroidUrls[13][1] = "https://www.javatpoint.com/android-texttospeech-example";

        AndroidUrls[14][0]  = "https://www.javatpoint.com/android-telephony-manager-tutorial";
        AndroidUrls[14][1]  = "https://www.javatpoint.com/android-call-state-example";
        AndroidUrls[14][2]  = "https://www.javatpoint.com/android-call-state-broadcastreceiver-example";
        AndroidUrls[14][3]  = "https://www.javatpoint.com/android-simple-caller-talker-example";
        AndroidUrls[14][4]  = "https://www.javatpoint.com/how-to-make-a-phone-call-in-android";
        AndroidUrls[14][5]  = "https://www.javatpoint.com/how-to-send-sms-in-android";
        AndroidUrls[14][6]  = "https://www.javatpoint.com/how-to-send-email-in-android-using-intent";

        AndroidUrls[15][0]  = "https://www.javatpoint.com/android-bluetooth-tutorial";
        AndroidUrls[15][1]  = "https://www.javatpoint.com/android-bluetooth-list-paired-devices-example";
        AndroidUrls[15][2]  = "https://www.javatpoint.com/android-wifi-example";

        AndroidUrls[16][0] = "https://www.javatpoint.com/android-camera-tutorial";

        AndroidUrls[17][0] = "https://www.javatpoint.com/android-sensor-tutorial";

        AndroidUrls[18][0] = "https://www.javatpoint.com/android-simple-graphics-example";

        AndroidUrls[19][0] = "https://www.javatpoint.com/android-animation-example";

        AndroidUrls[20][0] = "https://www.javatpoint.com/android-web-service";

        AndroidUrls[21][0]  = "https://www.javatpoint.com/android-google-map";
        AndroidUrls[21][1]  = "https://www.javatpoint.com/android-google-map-displaying-current-location";
        AndroidUrls[21][2]  = "https://www.javatpoint.com/android-google-map-search-location-using-geocodr";

        AndroidUrls[22][0]  = "https://www.javatpoint.com/android-google-admob";
        AndroidUrls[22][1]  = "https://www.javatpoint.com/android-banner-ads";
        AndroidUrls[22][2]  = "https://www.javatpoint.com/android-interstitial-ads";

        AndroidUrls[23][0]  = "https://www.javatpoint.com/android-qr-code-or-bar-code-scanner";
        AndroidUrls[23][1]  = "https://www.javatpoint.com/android-rss-feed-reader";
        AndroidUrls[23][2]  = "https://www.javatpoint.com/volley-library-fetching-json-data-from-url";
        AndroidUrls[23][3]  = "https://www.javatpoint.com/android-linkify-example";
        AndroidUrls[23][4]  = "https://www.javatpoint.com/android-introduction-slider-example";
        AndroidUrls[23][5]  = "https://www.javatpoint.com/android-recyclerview-list-example";
        AndroidUrls[23][6]  = "https://www.javatpoint.com/android-swipe-to-delete-recyclerview-items-with-undu";
        AndroidUrls[23][7]  = "https://www.javatpoint.com/swipe-to-refresh-android-activity";
        AndroidUrls[23][8]  = "https://www.javatpoint.com/android-volley-library-registration-login-logout";
        AndroidUrls[23][9]  = "https://www.javatpoint.com/android-network-connectivity-services";
        AndroidUrls[23][10] = "https://www.javatpoint.com/android-firebase-authentication-google-login";
        AndroidUrls[23][11] = "https://www.javatpoint.com/android-notification";
        AndroidUrls[23][12] = "https://www.javatpoint.com/using-google-recaptcha-in-android-application";

        AndroidUrls[24][0]  = "https://www.javatpoint.com/android-googlesignin-integrating";
        AndroidUrls[24][1]  = "https://www.javatpoint.com/android-linkedin-integrating";
        AndroidUrls[24][2]  = "https://www.javatpoint.com/android-twitter-integrating";

        AndroidUrls[25][0]  = "https://www.javatpoint.com/android-versions";
        AndroidUrls[25][1]  = "https://www.javatpoint.com/android-kitkat";
        AndroidUrls[25][2]  = "https://www.javatpoint.com/android-lollipop";
        AndroidUrls[25][3]  = "https://www.javatpoint.com/android-marshmallow";
        AndroidUrls[25][4]  = "https://www.javatpoint.com/android-nougat";
        AndroidUrls[25][5]  = "https://www.javatpoint.com/android-oreo";
        AndroidUrls[25][6]  = "https://www.javatpoint.com/android-pie";
        AndroidUrls[25][7]  = "https://www.javatpoint.com/android-10";

        AndroidUrls[26][0] = "https://www.javatpoint.com/android-quiz";

        AndroidUrls[27][0] = "https://www.javatpoint.com/android-interview-questions";

        AndroidUrls[28][0] = "https://stackoverflow.com/questions/tagged/android?sort=MostFrequent&edited=true";

        AndroidUrls[29][0] = "https://developer.android.com/courses";

        AndroidUrls[30][0] = "https://www.youtube.com/watch?v=aS__9RbCyHg";
        AndroidUrls[30][1] = "https://www.youtube.com/watch?v=mXjZQX3UzOs";
        AndroidUrls[30][2] = "https://www.youtube.com/watch?v=roDz8mMvbIg&list=PLknSwrodgQ72X4sKpzf5vT8kY80HKcUSe";
        AndroidUrls[30][3] = "https://www.youtube.com/watch?v=InigFUSiPl8&list=PLu0W_9lII9aiL0kysYlfSOUgY5rNlOhUd";
        AndroidUrls[30][4] = "https://www.youtube.com/channel/UC_Fh8kvtkVPkeihBs42jGcA";

        AndroidUrls[31][0] = "https://www.youtube.com/watch?v=fYkpwqPXC-8&list=PLzLFqCABnRQduspfbu2empaaY9BoIGLDM";
        AndroidUrls[31][1] = "https://www.youtube.com/watch?v=fJWFeW09qeE&list=PLzLFqCABnRQftQQETzoVMuteXzNiXmnj8";
        AndroidUrls[31][2] = "https://www.youtube.com/watch?v=gPqJcPtN18I&list=PLxefhmF0pcPmtdoud8f64EpgapkclCllj";
        AndroidUrls[31][3] = "https://www.youtube.com/watch?v=xZcHWz077zA&list=PLxefhmF0pcPmPx6bzZNNi61AIodtigWlD";
        AndroidUrls[31][4] = "https://www.youtube.com/watch?v=b21fiIyOW4A";
    }
}