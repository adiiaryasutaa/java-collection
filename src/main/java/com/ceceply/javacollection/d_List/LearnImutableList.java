package com.ceceply.javacollection.d_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnImutableList {
  public static void main(String[] args) {
    
    List<Float> studentValues = new ArrayList<>();

    studentValues.add(97.5f);
    studentValues.add(95.f);
    studentValues.add(100.f);

    List<Float> mathValues = Collections.unmodifiableList(studentValues);

    mathValues.add(92.5f);
    /* 
      Exception in thread "main" java.lang.UnsupportedOperationException
        at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1067)
        at com.ceceply.javacollection.LearnImutableList.main(LearnImutableList.java:19)
    */

  }
}
