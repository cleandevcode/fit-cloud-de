package tc;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.content.Context;
import android.os.Build;
import com.polidea.rxandroidble3.internal.RxBleLog;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import oc.c1;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public final Context f27963a;

    public c(Context context) {
        this.f27963a = context;
    }

    public static boolean b(BluetoothGatt bluetoothGatt, c1.b bVar) {
        RxBleLog.v("Connecting using reflection", new Object[0]);
        Field declaredField = bluetoothGatt.getClass().getDeclaredField("mAutoConnect");
        declaredField.setAccessible(true);
        declaredField.setBoolean(bluetoothGatt, true);
        Method declaredMethod = bluetoothGatt.getClass().getDeclaredMethod("connect", Boolean.class, BluetoothGattCallback.class);
        declaredMethod.setAccessible(true);
        return ((Boolean) declaredMethod.invoke(bluetoothGatt, Boolean.TRUE, bVar)).booleanValue();
    }

    public static Object d(Object obj) {
        if (obj == null) {
            return null;
        }
        Method declaredMethod = obj.getClass().getDeclaredMethod("getBluetoothGatt", new Class[0]);
        declaredMethod.setAccessible(true);
        return declaredMethod.invoke(obj, new Object[0]);
    }

    public static Object e() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return null;
        }
        Method declaredMethod = defaultAdapter.getClass().getDeclaredMethod("getBluetoothManager", new Class[0]);
        declaredMethod.setAccessible(true);
        return declaredMethod.invoke(defaultAdapter, new Object[0]);
    }

    public final BluetoothGatt a(BluetoothDevice bluetoothDevice, c1.b bVar, boolean z10) {
        BluetoothGatt connectGatt;
        RxBleLog.v("Connecting without reflection", new Object[0]);
        if (Build.VERSION.SDK_INT >= 23) {
            connectGatt = bluetoothDevice.connectGatt(this.f27963a, z10, bVar, 2);
            return connectGatt;
        }
        return bluetoothDevice.connectGatt(this.f27963a, z10, bVar);
    }

    @TargetApi(23)
    public final BluetoothGatt c(Object obj, BluetoothDevice bluetoothDevice) {
        Constructor<?> constructor = BluetoothGatt.class.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        RxBleLog.v("Found constructor with args count = " + constructor.getParameterTypes().length, new Object[0]);
        return (BluetoothGatt) (constructor.getParameterTypes().length == 4 ? constructor.newInstance(this.f27963a, obj, bluetoothDevice, 2) : constructor.newInstance(this.f27963a, obj, bluetoothDevice));
    }
}
