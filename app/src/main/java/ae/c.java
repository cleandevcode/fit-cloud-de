package ae;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class c {
    public static boolean a(BluetoothProfile bluetoothProfile, BluetoothDevice bluetoothDevice) {
        StringBuilder sb2;
        String str;
        if (bluetoothProfile != null && bluetoothDevice != null) {
            try {
                ge.b.n("connectProfile :" + p.b.m(bluetoothDevice.getAddress()));
                Method method = bluetoothProfile.getClass().getMethod("connect", BluetoothDevice.class);
                method.setAccessible(true);
                return ((Boolean) method.invoke(bluetoothProfile, bluetoothDevice)).booleanValue();
            } catch (IllegalAccessException e10) {
                e = e10;
                sb2 = new StringBuilder("Could not execute method 'connect' in profile ");
                sb2.append(bluetoothProfile.getClass().getName());
                sb2.append(", ignoring request.");
                sb2.append(e.toString());
                str = sb2.toString();
                ge.b.p(str);
                return false;
            } catch (NoSuchMethodException unused) {
                str = "No connect method in the " + bluetoothProfile.getClass().getName() + " class, ignoring request.";
                ge.b.p(str);
                return false;
            } catch (InvocationTargetException e11) {
                e = e11;
                sb2 = new StringBuilder("Could not execute method 'connect' in profile ");
                sb2.append(bluetoothProfile.getClass().getName());
                sb2.append(", ignoring request.");
                sb2.append(e.toString());
                str = sb2.toString();
                ge.b.p(str);
                return false;
            }
        }
        return false;
    }

    public static boolean b(BluetoothProfile bluetoothProfile, String str, BluetoothDevice bluetoothDevice) {
        StringBuilder sb2;
        String str2;
        if (bluetoothProfile != null && bluetoothDevice != null) {
            try {
                ge.b.n("connectProfile :" + p.b.m(bluetoothDevice.getAddress()));
                Class<? extends U> asSubclass = bluetoothProfile.getClass().asSubclass(Class.forName(str));
                if (asSubclass != 0) {
                    Method method = asSubclass.getMethod("connect", BluetoothDevice.class);
                    method.setAccessible(true);
                    return ((Boolean) method.invoke(bluetoothProfile, bluetoothDevice)).booleanValue();
                }
                ge.b.p("no class found: " + str);
                return false;
            } catch (ClassNotFoundException e10) {
                e = e10;
                sb2 = new StringBuilder("Could not find clas: ");
                sb2.append(str);
                sb2.append(", ignoring request.");
                sb2.append(e.toString());
                str2 = sb2.toString();
                ge.b.p(str2);
                return false;
            } catch (IllegalAccessException e11) {
                e = e11;
                sb2 = new StringBuilder("Could not execute method 'connect' in profile ");
                sb2.append(str);
                sb2.append(", ignoring request.");
                sb2.append(e.toString());
                str2 = sb2.toString();
                ge.b.p(str2);
                return false;
            } catch (NoSuchMethodException unused) {
                str2 = "No connect method in the " + str + " class, ignoring request.";
                ge.b.p(str2);
                return false;
            } catch (InvocationTargetException e12) {
                e = e12;
                sb2 = new StringBuilder("Could not execute method 'connect' in profile ");
                sb2.append(str);
                sb2.append(", ignoring request.");
                sb2.append(e.toString());
                str2 = sb2.toString();
                ge.b.p(str2);
                return false;
            }
        }
        return false;
    }

    public static boolean c(BluetoothProfile bluetoothProfile, BluetoothDevice bluetoothDevice) {
        String str;
        if (bluetoothProfile != null && bluetoothDevice != null) {
            String str2 = "";
            try {
                str2 = bluetoothProfile.getClass().getName();
                ge.b.n(String.format("disconnect : %s : %s", str2, p.b.m(bluetoothDevice.getAddress())));
                Method method = bluetoothProfile.getClass().getMethod("disconnect", BluetoothDevice.class);
                method.setAccessible(true);
                return ((Boolean) method.invoke(bluetoothProfile, bluetoothDevice)).booleanValue();
            } catch (IllegalAccessException e10) {
                e = e10;
                str = "Could not execute method 'disconnect' in profile " + str2 + ", ignoring request." + e.toString();
                ge.b.p(str);
                return false;
            } catch (NoSuchMethodException unused) {
                str = "No disconnect method in the " + str2 + " class, ignoring request.";
                ge.b.p(str);
                return false;
            } catch (InvocationTargetException e11) {
                e = e11;
                str = "Could not execute method 'disconnect' in profile " + str2 + ", ignoring request." + e.toString();
                ge.b.p(str);
                return false;
            }
        }
        return false;
    }

    @TargetApi(19)
    public static int d(BluetoothProfile bluetoothProfile, String str, BluetoothDevice bluetoothDevice) {
        String str2;
        if (bluetoothDevice == null) {
            return 0;
        }
        try {
            Method method = bluetoothProfile.getClass().asSubclass(Class.forName(str)).getMethod("getConnectionState", BluetoothDevice.class);
            method.setAccessible(true);
            return ((Integer) method.invoke(bluetoothProfile, bluetoothDevice)).intValue();
        } catch (ClassNotFoundException e10) {
            str2 = "Could not find clas: " + str + ", ignoring request." + e10.toString();
            ge.b.p(str2);
            return 0;
        } catch (IllegalAccessException e11) {
            e = e11;
            str2 = "Could not execute method 'connect' in profile CLASS_NAME, ignoring request." + e.toString();
            ge.b.p(str2);
            return 0;
        } catch (NoSuchMethodException unused) {
            str2 = "No connect method in the CLASS_NAME class, ignoring request.";
            ge.b.p(str2);
            return 0;
        } catch (InvocationTargetException e12) {
            e = e12;
            str2 = "Could not execute method 'connect' in profile CLASS_NAME, ignoring request." + e.toString();
            ge.b.p(str2);
            return 0;
        }
    }

    public static boolean e(BluetoothA2dp bluetoothA2dp, BluetoothDevice bluetoothDevice) {
        if (bluetoothA2dp == null) {
            return false;
        }
        try {
            bluetoothA2dp.getClass().getMethod("setPriority", BluetoothDevice.class, Integer.TYPE).invoke(bluetoothA2dp, bluetoothDevice, 100);
            return true;
        } catch (Exception e10) {
            ge.b.p(e10.toString());
            return false;
        }
    }
}
