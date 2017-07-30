package com.tarkalabs.demolibrary;

import android.content.Context;

/**
 * Created by kalpesh on 30/07/17.
 */

public class MyLib {
  private static MyLib INSTANCE;

  private Context context;

  public MyLib(Context context) {
    this.context = context;
  }

  public static MyLib getInstance(Context context) {
    if (INSTANCE == null) {
      INSTANCE = new MyLib(context.getApplicationContext());
    }
    return INSTANCE;
  }
}
