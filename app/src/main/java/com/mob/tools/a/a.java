package com.mob.tools.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.location.Location;
import android.os.Handler;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public interface a {
    String A();

    String B();

    String[] C();

    String D();

    int E();

    int F();

    int G();

    int H();

    int I();

    int J();

    int K();

    int L();

    ArrayList<HashMap<String, Object>> M();

    HashMap<String, Object> N();

    ArrayList<HashMap<String, Object>> O();

    boolean P();

    int Q();

    String R();

    String S();

    String T();

    HashMap<String, Object> U();

    ArrayList<ArrayList<String>> V();

    int W();

    int X();

    String Y();

    HashMap<String, HashMap<String, Long>> Z();

    ApplicationInfo a(String str, int i10);

    PackageInfo a(boolean z10, int i10, String str, int i11);

    Location a(int i10, int i11, boolean z10);

    String a(String str, String str2);

    String a(boolean z10);

    List<ResolveInfo> a(Intent intent, int i10);

    void a(BroadcastReceiver broadcastReceiver);

    void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter);

    void a(Handler.Callback callback);

    void a(View view);

    void a(BlockingQueue<Boolean> blockingQueue);

    boolean a();

    boolean a(String str);

    HashMap<String, Object> aA();

    ArrayList<HashMap<String, Object>> aB();

    String aC();

    String aD();

    String aE();

    String aF();

    int aG();

    String aH();

    boolean aI();

    String aJ();

    boolean aK();

    Object aL();

    Context aM();

    String aN();

    String aO();

    long aP();

    String aQ();

    String aR();

    String aS();

    String aT();

    String aU();

    String aV();

    String aW();

    String aX();

    String aY();

    String aZ();

    HashMap<String, Long> aa();

    int ab();

    String ac();

    String ad();

    String ae();

    String af();

    String ag();

    boolean ah();

    int ai();

    ArrayList<HashMap<String, String>> aj();

    String ak();

    HashMap<String, Object> al();

    HashMap<String, String> am();

    String an();

    String ao();

    HashMap<String, Object> ap();

    String aq();

    String ar();

    String as();

    HashMap<String, Object> at();

    String au();

    ArrayList<HashMap<String, String>> av();

    ArrayList<HashMap<String, String>> aw();

    String ax();

    String ay();

    String az();

    ResolveInfo b(Intent intent, int i10);

    String b(String str);

    String b(boolean z10);

    void b(View view);

    boolean b();

    String ba();

    String bb();

    HashMap<String, Object> bc();

    ApplicationInfo bd();

    ArrayList<HashMap<String, Object>> be();

    boolean bf();

    String c(String str);

    String c(boolean z10);

    boolean c();

    String d(boolean z10);

    List<String> d(String str);

    boolean d();

    String e(boolean z10);

    boolean e();

    boolean e(String str);

    String f(String str);

    ArrayList<HashMap<String, String>> f(boolean z10);

    boolean f();

    String g(String str);

    String g(boolean z10);

    boolean g();

    boolean h();

    boolean h(String str);

    boolean i();

    boolean j();

    boolean k();

    String l();

    String m();

    String n();

    String o();

    String p();

    String[] q();

    String r();

    String s();

    String t();

    String u();

    String v();

    String w();

    String x();

    String y();

    String z();
}
