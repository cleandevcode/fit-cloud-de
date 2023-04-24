package c9;

import android.os.Bundle;
import android.os.IInterface;

/* loaded from: classes.dex */
public interface c extends IInterface {
    p8.b getView();

    void m0(b9.f fVar);

    void onCreate(Bundle bundle);

    void onDestroy();

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    void onStop();
}
