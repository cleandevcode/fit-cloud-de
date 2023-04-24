package com.sina.weibo.sdk.b;

import android.util.Log;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: ai */
    private static boolean f9498ai = false;

    public static void a(String str, String str2) {
        if (f9498ai) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            Log.d(str, (stackTraceElement.getFileName() + "(" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + ": " + str2);
        }
    }

    public static void b(String str, String str2) {
        if (f9498ai) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            Log.e(str, (stackTraceElement.getFileName() + "(" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + ": " + str2);
        }
    }

    public static void setLoggerEnable(boolean z10) {
        f9498ai = z10;
    }
}
