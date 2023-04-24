package s;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class h2 {

    /* renamed from: c */
    public final String f25981c;

    /* renamed from: d */
    public final c f25982d;

    /* renamed from: e */
    public final t.t f25983e;

    /* renamed from: f */
    public final w.d f25984f;

    /* renamed from: g */
    public final w.e f25985g;

    /* renamed from: h */
    public final int f25986h;

    /* renamed from: i */
    public final boolean f25987i;

    /* renamed from: k */
    public boolean f25989k;

    /* renamed from: l */
    public boolean f25990l;

    /* renamed from: m */
    public a0.i f25991m;

    /* renamed from: o */
    public final t1 f25993o;

    /* renamed from: a */
    public final ArrayList f25979a = new ArrayList();

    /* renamed from: b */
    public final HashMap f25980b = new HashMap();

    /* renamed from: j */
    public final HashMap f25988j = new HashMap();

    /* renamed from: n */
    public HashMap f25992n = new HashMap();

    /* renamed from: p */
    public final w.l f25994p = new w.l();

    /* JADX WARN: Removed duplicated region for block: B:105:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h2(android.content.Context r10, java.lang.String r11, t.d0 r12, s.c r13) {
        /*
            Method dump skipped, instructions count: 1229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s.h2.<init>(android.content.Context, java.lang.String, t.d0, s.c):void");
    }

    public static void f(List list, Size size) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = -1;
        for (int i11 = 0; i11 < list.size(); i11++) {
            Size size2 = (Size) list.get(i11);
            if (size2.getWidth() < size.getWidth() || size2.getHeight() < size.getHeight()) {
                break;
            }
            if (i10 >= 0) {
                arrayList.add((Size) list.get(i10));
            }
            i10 = i11;
        }
        list.removeAll(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x009b, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.util.ArrayList r13) {
        /*
            r12 = this;
            java.util.ArrayList r0 = r12.f25979a
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto La2
            java.lang.Object r2 = r0.next()
            a0.y1 r2 = (a0.y1) r2
            r2.getClass()
            boolean r3 = r13.isEmpty()
            r4 = 1
            if (r3 == 0) goto L21
            r2 = 1
            goto La0
        L21:
            int r3 = r13.size()
            java.util.ArrayList r5 = r2.f211a
            int r5 = r5.size()
            if (r3 <= r5) goto L30
            r2 = 0
            goto La0
        L30:
            java.util.ArrayList r3 = r2.f211a
            int r3 = r3.size()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int[] r6 = new int[r3]
            a0.y1.b(r5, r3, r6, r1)
            java.util.Iterator r3 = r5.iterator()
        L44:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L9e
            java.lang.Object r5 = r3.next()
            int[] r5 = (int[]) r5
            r6 = 0
            r7 = 1
        L52:
            java.util.ArrayList r8 = r2.f211a
            int r8 = r8.size()
            if (r6 >= r8) goto L9b
            r8 = r5[r6]
            int r9 = r13.size()
            if (r8 >= r9) goto L98
            java.util.ArrayList r8 = r2.f211a
            java.lang.Object r8 = r8.get(r6)
            a0.b2 r8 = (a0.b2) r8
            r9 = r5[r6]
            java.lang.Object r9 = r13.get(r9)
            a0.b2 r9 = (a0.b2) r9
            r8.getClass()
            int r10 = r9.b()
            int r9 = r9.a()
            int r9 = s.c0.b(r9)
            int r11 = r8.a()
            int r11 = s.c0.b(r11)
            if (r9 > r11) goto L93
            int r8 = r8.b()
            if (r10 != r8) goto L93
            r8 = 1
            goto L94
        L93:
            r8 = 0
        L94:
            r7 = r7 & r8
            if (r7 != 0) goto L98
            goto L9b
        L98:
            int r6 = r6 + 1
            goto L52
        L9b:
            if (r7 == 0) goto L44
            goto L9f
        L9e:
            r4 = 0
        L9f:
            r2 = r4
        La0:
            if (r2 == 0) goto L8
        La2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s.h2.a(java.util.ArrayList):boolean");
    }

    public final Size[] b(Size[] sizeArr, int i10) {
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        Size size;
        Size size2;
        ArrayList arrayList2;
        List list = (List) this.f25988j.get(Integer.valueOf(i10));
        if (list == null) {
            w.d dVar = this.f25984f;
            dVar.getClass();
            if (((v.l) v.k.a(v.l.class)) == null) {
                list = new ArrayList();
            } else {
                String str = (String) dVar.f29489a;
                String str2 = Build.BRAND;
                boolean z12 = true;
                if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList2 = arrayList3;
                    arrayList2 = arrayList3;
                    if (str.equals("0") && i10 == 256) {
                        arrayList3.add(new Size(4160, 3120));
                        arrayList3.add(new Size(4000, 3000));
                        arrayList2 = arrayList3;
                    }
                } else {
                    if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        ArrayList arrayList4 = new ArrayList();
                        arrayList2 = arrayList4;
                        arrayList2 = arrayList4;
                        if (str.equals("0") && i10 == 256) {
                            arrayList4.add(new Size(4160, 3120));
                            arrayList4.add(new Size(4000, 3000));
                            arrayList2 = arrayList4;
                        }
                    } else {
                        if (("HUAWEI".equalsIgnoreCase(str2) && "HWANE".equalsIgnoreCase(Build.DEVICE)) ? false : false) {
                            arrayList = new ArrayList();
                            if (str.equals("0") && (i10 == 34 || i10 == 35)) {
                                arrayList.add(new Size(720, 720));
                                arrayList.add(new Size(400, 400));
                            }
                        } else if (v.l.b()) {
                            arrayList = new ArrayList();
                            if (str.equals("0")) {
                                if (i10 != 34) {
                                    if (i10 == 35) {
                                        arrayList.add(new Size(4128, 2322));
                                        arrayList.add(new Size(3088, 3088));
                                        arrayList.add(new Size(3264, 2448));
                                        arrayList.add(new Size(3264, 1836));
                                        arrayList.add(new Size(2048, 1536));
                                        arrayList.add(new Size(2048, 1152));
                                        size2 = new Size(1920, 1080);
                                    }
                                } else {
                                    arrayList.add(new Size(4128, 3096));
                                    arrayList.add(new Size(4128, 2322));
                                    arrayList.add(new Size(3088, 3088));
                                    arrayList.add(new Size(3264, 2448));
                                    arrayList.add(new Size(3264, 1836));
                                    arrayList.add(new Size(2048, 1536));
                                    arrayList.add(new Size(2048, 1152));
                                    size2 = new Size(1920, 1080);
                                }
                                arrayList.add(size2);
                            } else if (str.equals("1") && (i10 == 34 || i10 == 35)) {
                                arrayList.add(new Size(3264, 2448));
                                arrayList.add(new Size(3264, 1836));
                                arrayList.add(new Size(2448, 2448));
                                arrayList.add(new Size(1920, 1920));
                                arrayList.add(new Size(2048, 1536));
                                arrayList.add(new Size(2048, 1152));
                                size2 = new Size(1920, 1080);
                                arrayList.add(size2);
                            }
                        } else if (v.l.a()) {
                            arrayList = new ArrayList();
                            if (str.equals("0")) {
                                if (i10 != 34) {
                                    if (i10 == 35) {
                                        arrayList.add(new Size(2048, 1536));
                                        arrayList.add(new Size(2048, 1152));
                                        size = new Size(1920, 1080);
                                    }
                                } else {
                                    arrayList.add(new Size(4128, 3096));
                                    arrayList.add(new Size(4128, 2322));
                                    arrayList.add(new Size(3088, 3088));
                                    arrayList.add(new Size(3264, 2448));
                                    arrayList.add(new Size(3264, 1836));
                                    arrayList.add(new Size(2048, 1536));
                                    arrayList.add(new Size(2048, 1152));
                                    size = new Size(1920, 1080);
                                }
                                arrayList.add(size);
                            } else if (str.equals("1") && (i10 == 34 || i10 == 35)) {
                                arrayList.add(new Size(2576, 1932));
                                arrayList.add(new Size(2560, 1440));
                                arrayList.add(new Size(1920, 1920));
                                arrayList.add(new Size(2048, 1536));
                                arrayList.add(new Size(2048, 1152));
                                size = new Size(1920, 1080);
                                arrayList.add(size);
                            }
                        } else {
                            y.u0.h("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
                            arrayList2 = Collections.emptyList();
                        }
                        arrayList2 = arrayList;
                    }
                }
                list = arrayList2;
            }
            this.f25988j.put(Integer.valueOf(i10), list);
        }
        ArrayList arrayList5 = new ArrayList(Arrays.asList(sizeArr));
        arrayList5.removeAll(list);
        return (Size[]) arrayList5.toArray(new Size[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0072, code lost:
        if (r9.f25982d.b(r3, 4) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r9 = this;
            android.util.Size r0 = new android.util.Size
            r1 = 640(0x280, float:8.97E-43)
            r2 = 480(0x1e0, float:6.73E-43)
            r0.<init>(r1, r2)
            s.t1 r1 = r9.f25993o
            android.util.Size r1 = r1.d()
            r2 = 1
            java.lang.String r3 = r9.f25981c     // Catch: java.lang.NumberFormatException -> L86
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L86
            s.c r4 = r9.f25982d
            boolean r4 = r4.b(r3, r2)
            r5 = 0
            if (r4 == 0) goto L26
            s.c r4 = r9.f25982d
            android.media.CamcorderProfile r2 = r4.a(r3, r2)
            goto L27
        L26:
            r2 = r5
        L27:
            if (r2 == 0) goto L34
            android.util.Size r3 = new android.util.Size
            int r4 = r2.videoFrameWidth
            int r2 = r2.videoFrameHeight
            r3.<init>(r4, r2)
            goto Lc8
        L34:
            android.util.Size r2 = i0.b.f16192c
            s.c r4 = r9.f25982d
            r6 = 10
            boolean r4 = r4.b(r3, r6)
            if (r4 == 0) goto L41
            goto L74
        L41:
            s.c r4 = r9.f25982d
            r6 = 8
            boolean r4 = r4.b(r3, r6)
            if (r4 == 0) goto L4c
            goto L74
        L4c:
            s.c r4 = r9.f25982d
            r6 = 12
            boolean r4 = r4.b(r3, r6)
            if (r4 == 0) goto L57
            goto L74
        L57:
            s.c r4 = r9.f25982d
            r6 = 6
            boolean r4 = r4.b(r3, r6)
            if (r4 == 0) goto L61
            goto L74
        L61:
            s.c r4 = r9.f25982d
            r6 = 5
            boolean r4 = r4.b(r3, r6)
            if (r4 == 0) goto L6b
            goto L74
        L6b:
            s.c r4 = r9.f25982d
            r6 = 4
            boolean r4 = r4.b(r3, r6)
            if (r4 == 0) goto L7a
        L74:
            s.c r4 = r9.f25982d
            android.media.CamcorderProfile r5 = r4.a(r3, r6)
        L7a:
            if (r5 == 0) goto Lc7
            android.util.Size r2 = new android.util.Size
            int r3 = r5.videoFrameWidth
            int r4 = r5.videoFrameHeight
            r2.<init>(r3, r4)
            goto Lc7
        L86:
            t.t r3 = r9.f25983e
            android.hardware.camera2.CameraCharacteristics$Key r4 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP
            java.lang.Object r3 = r3.a(r4)
            android.hardware.camera2.params.StreamConfigurationMap r3 = (android.hardware.camera2.params.StreamConfigurationMap) r3
            if (r3 == 0) goto Ld0
            java.lang.Class<android.media.MediaRecorder> r4 = android.media.MediaRecorder.class
            android.util.Size[] r3 = r3.getOutputSizes(r4)
            if (r3 != 0) goto L9c
            goto Lc5
        L9c:
            b0.d r4 = new b0.d
            r4.<init>(r2)
            java.util.Arrays.sort(r3, r4)
            int r2 = r3.length
            r4 = 0
        La6:
            if (r4 >= r2) goto Lc5
            r5 = r3[r4]
            int r6 = r5.getWidth()
            android.util.Size r7 = i0.b.f16193d
            int r8 = r7.getWidth()
            if (r6 > r8) goto Lc2
            int r6 = r5.getHeight()
            int r7 = r7.getHeight()
            if (r6 > r7) goto Lc2
            r3 = r5
            goto Lc8
        Lc2:
            int r4 = r4 + 1
            goto La6
        Lc5:
            android.util.Size r2 = i0.b.f16192c
        Lc7:
            r3 = r2
        Lc8:
            a0.i r2 = new a0.i
            r2.<init>(r0, r1, r3)
            r9.f25991m = r2
            return
        Ld0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s.h2.c():void");
    }

    public final Size[] d(int i10) {
        Size[] outputSizes;
        Size[] sizeArr = (Size[]) this.f25992n.get(Integer.valueOf(i10));
        if (sizeArr == null) {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f25983e.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap != null) {
                if (Build.VERSION.SDK_INT < 23 && i10 == 34) {
                    outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                } else {
                    outputSizes = streamConfigurationMap.getOutputSizes(i10);
                }
                if (outputSizes != null) {
                    Size[] b10 = b(outputSizes, i10);
                    Arrays.sort(b10, new b0.d(true));
                    this.f25992n.put(Integer.valueOf(i10), b10);
                    return b10;
                }
                throw new IllegalArgumentException(androidx.appcompat.widget.u0.a("Can not get supported output size for the format: ", i10));
            }
            throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
        }
        return sizeArr;
    }

    public final Size e(a0.a1 a1Var) {
        boolean z10;
        boolean z11 = false;
        int x10 = a1Var.x(0);
        Size q10 = a1Var.q();
        if (q10 != null) {
            Integer num = (Integer) this.f25983e.a(CameraCharacteristics.SENSOR_ORIENTATION);
            h1.i(num, "Camera HAL in bad state, unable to retrieve the SENSOR_ORIENTATION");
            int u10 = b0.c.u(x10);
            Integer num2 = (Integer) this.f25983e.a(CameraCharacteristics.LENS_FACING);
            h1.i(num2, "Camera HAL in bad state, unable to retrieve the LENS_FACING");
            if (1 == num2.intValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            int n10 = b0.c.n(u10, num.intValue(), z10);
            if ((n10 == 90 || n10 == 270) ? true : true) {
                return new Size(q10.getHeight(), q10.getWidth());
            }
            return q10;
        }
        return q10;
    }
}
