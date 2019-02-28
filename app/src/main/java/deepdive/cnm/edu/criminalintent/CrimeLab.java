package deepdive.cnm.edu.criminalintent;

import android.content.Context;

public class CrimeLab {
  private static CrimeLab sCrimelab;

  public static Crimelab get(Context context) {
    if (sCrimelab == null)  {
      sCrimelab = new Crimelab(context);
    }
    return sCrimelab;
  }

  private CrimeLab(Context context) {

  }

}
