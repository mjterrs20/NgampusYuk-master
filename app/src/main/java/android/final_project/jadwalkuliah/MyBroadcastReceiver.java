package android.final_project.jadwalkuliah;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.widget.Toast;

/**
 * Created by Asus on 13/02/2018.
 */

public class MyBroadcastReceiver extends BroadcastReceiver{
    public void onReceive (Context context, Intent intent ){
        Toast.makeText(context, "ada matkul coy", Toast.LENGTH_SHORT).show();

        Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(8000);
    }
}
