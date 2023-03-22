package com.luis.patterns.test;

public class SandboxTest
{
  public static void main(String[] args) {
    String filter = "(tolower(Id) eq '010editor.install') and (IsLatestVersion eq true)";
    String toLowerString = "tolower(Id) eq ";

    int indexStarts = filter.indexOf(toLowerString) + toLowerString.length();

    String filter2 = "(IsLatestVersion eq true) and (tolower(Id) eq '010editor.install')";
    int indexStarts2 = filter2.indexOf(toLowerString) + toLowerString.length();

    int indexEnds = filter.substring(indexStarts+1).indexOf("'") + indexStarts;
    int indexEnds2 = filter2.substring(indexStarts2+1).indexOf("'") + indexStarts2;

    String subString = filter.substring(indexStarts+1,indexEnds + 1);
    String subString2 = filter2.substring(indexStarts2+1, indexEnds2 + 1);
  }
}
