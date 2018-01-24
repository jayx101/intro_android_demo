package codepath.apps.demointroandroid;

import android.app.Activity;
import android.app.Application;
import com.speed_trap.android.AndroidCSA;

import com.speed_trap.android.Communications;
import com.speed_trap.android.LogCatLogger;
import com.speed_trap.android.OperationalMode;
import com.speed_trap.android.automatic.AutoInstrumentApiLevel14;


/**
 * Created by jacques on 12/10/17.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {

        AutoInstrumentApiLevel14.instrument(this);
        Activity mContext;
        mContext = null;

        AndroidCSA.start( Communications.BATCHED_PERIODICALLY, OperationalMode.DRY_RUN, "HSBCHKSIT", "https://www.issthksit.hsbc.com.hk:5843",
                mContext, false, true, "RewardsMe+_Dev");
        //AndroidCSA.setLogger(new LogCatLogger());

        AndroidCSA.setLogger(new LogCatLogger());

        super.onCreate();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
