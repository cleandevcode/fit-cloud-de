package com.mob.commons.cc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Build;

/* loaded from: classes.dex */
public class c implements s<Context> {
    @Override // com.mob.commons.cc.s
    public boolean a(Context context, Class<Context> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        int checkSelfPermission;
        Intent registerReceiver;
        if (com.mob.commons.a.d.a("016BggMjeGfiejgh>ejmWfiYjMei*k3efeh8j").equals(str) && objArr.length == 1) {
            Object obj = objArr[0];
            if (obj instanceof String) {
                try {
                    objArr2[0] = context.getSystemService((String) obj);
                } catch (Throwable th2) {
                    objArr2[0] = null;
                    thArr[0] = th2;
                }
                return true;
            }
        }
        if ("getApplicationInfo".equals(str) && objArr.length == 0) {
            objArr2[0] = context.getApplicationInfo();
            return true;
        } else if (com.mob.commons.a.d.a("0182ggXje;hhfdel4ejMel2eLhf7jPghfdfe1kjWei").equals(str) && objArr.length == 0) {
            objArr2[0] = context.getContentResolver();
            return true;
        } else if (com.mob.commons.a.d.a("014-ggWje)hiegehekeggg+j^fgeg%mj").equals(str) && objArr.length == 0) {
            objArr2[0] = context.getPackageName();
            return true;
        } else if (com.mob.commons.a.d.a("017Ygg*je+hiegehekegggLj%hjegeleggg,jEei").equals(str) && objArr.length == 0) {
            objArr2[0] = context.getPackageManager();
            return true;
        } else {
            if ("startActivity".equals(str) && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof Intent) {
                    context.startActivity((Intent) obj2);
                    return true;
                }
            }
            if (com.mob.commons.a.d.a("011>gg$je4gleffe_j%ghgjefei").equals(str)) {
                objArr2[0] = context.getFilesDir();
                return true;
            } else if (com.mob.commons.a.d.a("009;gg8je!fkghgh'je7gh").equals(str)) {
                objArr2[0] = context.getAssets();
                return true;
            } else {
                if (com.mob.commons.a.d.a("016*ei<jMggefghDej!eihfMj%eh7j.efHkjFei").equals(str)) {
                    if (Build.VERSION.SDK_INT >= 26 && objArr.length == 3) {
                        Object obj3 = objArr[0];
                        if (obj3 instanceof BroadcastReceiver) {
                            Object obj4 = objArr[1];
                            if (obj4 instanceof IntentFilter) {
                                Object obj5 = objArr[2];
                                if (obj5 instanceof Integer) {
                                    registerReceiver = context.registerReceiver((BroadcastReceiver) obj3, (IntentFilter) obj4, ((Integer) obj5).intValue());
                                    objArr2[0] = registerReceiver;
                                    return true;
                                }
                            }
                        }
                    }
                    if (objArr.length == 2) {
                        Object obj6 = objArr[0];
                        if (obj6 instanceof BroadcastReceiver) {
                            Object obj7 = objArr[1];
                            if (obj7 instanceof IntentFilter) {
                                objArr2[0] = context.registerReceiver((BroadcastReceiver) obj6, (IntentFilter) obj7);
                                return true;
                            }
                        }
                    }
                } else if (com.mob.commons.a.d.a("018IedeleiQjXggefgh-ejQeihf>jVeh@jEef,kj=ei").equals(str)) {
                    context.unregisterReceiver((BroadcastReceiver) objArr[0]);
                    return true;
                } else {
                    if (com.mob.commons.a.d.a("019_eh[dj!ehekfiSj$fegihi^j6eiEm]efghgheffdel").equals(str) && objArr.length == 1) {
                        Object obj8 = objArr[0];
                        if (obj8 instanceof String) {
                            if (Build.VERSION.SDK_INT >= 23) {
                                checkSelfPermission = context.checkSelfPermission((String) obj8);
                                objArr2[0] = Integer.valueOf(checkSelfPermission);
                            } else {
                                objArr2[0] = Integer.valueOf(context.getPackageManager().checkPermission((String) objArr[0], context.getPackageName()));
                            }
                            return true;
                        }
                    }
                    if ("bindService".equals(str) && objArr.length == 3) {
                        objArr2[0] = Boolean.valueOf(context.bindService((Intent) objArr[0], (ServiceConnection) objArr[1], ((Integer) objArr[2]).intValue()));
                        return true;
                    } else if ("unbindService".equals(str) && objArr.length == 1) {
                        Object obj9 = objArr[0];
                        if (obj9 instanceof ServiceConnection) {
                            context.unbindService((ServiceConnection) obj9);
                            return true;
                        }
                    }
                }
                return false;
            }
        }
    }
}
