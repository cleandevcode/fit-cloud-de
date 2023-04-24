package b0;

import android.os.Build;
import android.util.Pair;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import no.nordicsemi.android.dfu.DfuBaseService;
import s.h1;
import y.u0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c */
    public static final m[] f3948c;

    /* renamed from: d */
    public static final m[][] f3949d;

    /* renamed from: e */
    public static final HashSet<String> f3950e;

    /* renamed from: a */
    public final List<Map<String, i>> f3951a;

    /* renamed from: b */
    public final ByteOrder f3952b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: c */
        public static final Pattern f3953c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: d */
        public static final Pattern f3954d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: e */
        public static final Pattern f3955e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: f */
        public static final ArrayList f3956f = Collections.list(new C0048a());

        /* renamed from: a */
        public final ArrayList f3957a = Collections.list(new b());

        /* renamed from: b */
        public final ByteOrder f3958b;

        /* renamed from: b0.j$a$a */
        /* loaded from: classes.dex */
        public class C0048a implements Enumeration<HashMap<String, m>> {

            /* renamed from: a */
            public int f3959a = 0;

            @Override // java.util.Enumeration
            public final boolean hasMoreElements() {
                int i10 = this.f3959a;
                m[] mVarArr = j.f3948c;
                return i10 < 4;
            }

            @Override // java.util.Enumeration
            public final HashMap<String, m> nextElement() {
                m[] mVarArr;
                HashMap<String, m> hashMap = new HashMap<>();
                for (m mVar : j.f3949d[this.f3959a]) {
                    hashMap.put(mVar.f3970b, mVar);
                }
                this.f3959a++;
                return hashMap;
            }
        }

        /* loaded from: classes.dex */
        public class b implements Enumeration<Map<String, i>> {

            /* renamed from: a */
            public int f3960a = 0;

            @Override // java.util.Enumeration
            public final boolean hasMoreElements() {
                int i10 = this.f3960a;
                m[] mVarArr = j.f3948c;
                return i10 < 4;
            }

            @Override // java.util.Enumeration
            public final Map<String, i> nextElement() {
                this.f3960a++;
                return new HashMap();
            }
        }

        public a(ByteOrder byteOrder) {
            this.f3958b = byteOrder;
        }

        public static Pair<Integer, Integer> a(String str) {
            if (str.contains(",")) {
                String[] split = str.split(",", -1);
                Pair<Integer, Integer> a10 = a(split[0]);
                if (((Integer) a10.first).intValue() == 2) {
                    return a10;
                }
                for (int i10 = 1; i10 < split.length; i10++) {
                    Pair<Integer, Integer> a11 = a(split[i10]);
                    int intValue = (((Integer) a11.first).equals(a10.first) || ((Integer) a11.second).equals(a10.first)) ? ((Integer) a10.first).intValue() : -1;
                    int intValue2 = (((Integer) a10.second).intValue() == -1 || !(((Integer) a11.first).equals(a10.second) || ((Integer) a11.second).equals(a10.second))) ? -1 : ((Integer) a10.second).intValue();
                    if (intValue == -1 && intValue2 == -1) {
                        return new Pair<>(2, -1);
                    }
                    if (intValue == -1) {
                        a10 = new Pair<>(Integer.valueOf(intValue2), -1);
                    } else if (intValue2 == -1) {
                        a10 = new Pair<>(Integer.valueOf(intValue), -1);
                    }
                }
                return a10;
            } else if (!str.contains("/")) {
                try {
                    try {
                        long parseLong = Long.parseLong(str);
                        int i11 = (parseLong > 0L ? 1 : (parseLong == 0L ? 0 : -1));
                        return (i11 < 0 || parseLong > 65535) ? i11 < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                    } catch (NumberFormatException unused) {
                        Double.parseDouble(str);
                        return new Pair<>(12, -1);
                    }
                } catch (NumberFormatException unused2) {
                    return new Pair<>(2, -1);
                }
            } else {
                String[] split2 = str.split("/", -1);
                if (split2.length == 2) {
                    try {
                        long parseDouble = (long) Double.parseDouble(split2[0]);
                        long parseDouble2 = (long) Double.parseDouble(split2[1]);
                        if (parseDouble >= 0 && parseDouble2 >= 0) {
                            if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                                return new Pair<>(10, 5);
                            }
                            return new Pair<>(5, -1);
                        }
                        return new Pair<>(10, -1);
                    } catch (NumberFormatException unused3) {
                    }
                }
                return new Pair<>(2, -1);
            }
        }

        public final void b(String str, String str2, ArrayList arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Map) it.next()).containsKey(str)) {
                    return;
                }
            }
            c(str, str2, arrayList);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:206:0x0196, code lost:
            if (r10 != r7) goto L129;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(java.lang.String r18, java.lang.String r19, java.util.ArrayList r20) {
            /*
                Method dump skipped, instructions count: 1054
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: b0.j.a.c(java.lang.String, java.lang.String, java.util.ArrayList):void");
        }

        public final void d(int i10) {
            int i11;
            if (i10 == 0) {
                i11 = 1;
            } else if (i10 == 90) {
                i11 = 6;
            } else if (i10 == 180) {
                i11 = 3;
            } else if (i10 != 270) {
                u0.h("ExifData", "Unexpected orientation value: " + i10 + ". Must be one of 0, 90, 180, 270.");
                i11 = 0;
            } else {
                i11 = 8;
            }
            c("Orientation", String.valueOf(i11), this.f3957a);
        }
    }

    static {
        m[] mVarArr = {new m(DfuBaseService.ERROR_REMOTE_TYPE_LEGACY, "ImageWidth", 3, 4), new m(257, "ImageLength", 3, 4), new m("Make", 271, 2), new m("Model", 272, 2), new m("Orientation", 274, 3), new m("XResolution", 282, 5), new m("YResolution", DfuBaseService.NOTIFICATION_ID, 5), new m("ResolutionUnit", 296, 3), new m("Software", 305, 2), new m("DateTime", 306, 2), new m("YCbCrPositioning", 531, 3), new m("SubIFDPointer", 330, 4), new m("ExifIFDPointer", 34665, 4), new m("GPSInfoIFDPointer", 34853, 4)};
        m[] mVarArr2 = {new m("ExposureTime", 33434, 5), new m("FNumber", 33437, 5), new m("ExposureProgram", 34850, 3), new m("PhotographicSensitivity", 34855, 3), new m("SensitivityType", 34864, 3), new m("ExifVersion", 36864, 2), new m("DateTimeOriginal", 36867, 2), new m("DateTimeDigitized", 36868, 2), new m("ComponentsConfiguration", 37121, 7), new m("ShutterSpeedValue", 37377, 10), new m("ApertureValue", 37378, 5), new m("BrightnessValue", 37379, 10), new m("ExposureBiasValue", 37380, 10), new m("MaxApertureValue", 37381, 5), new m("MeteringMode", 37383, 3), new m("LightSource", 37384, 3), new m("Flash", 37385, 3), new m("FocalLength", 37386, 5), new m("SubSecTime", 37520, 2), new m("SubSecTimeOriginal", 37521, 2), new m("SubSecTimeDigitized", 37522, 2), new m("FlashpixVersion", 40960, 7), new m("ColorSpace", 40961, 3), new m(40962, "PixelXDimension", 3, 4), new m(40963, "PixelYDimension", 3, 4), new m("InteroperabilityIFDPointer", 40965, 4), new m("FocalPlaneResolutionUnit", 41488, 3), new m("SensingMethod", 41495, 3), new m("FileSource", 41728, 7), new m("SceneType", 41729, 7), new m("CustomRendered", 41985, 3), new m("ExposureMode", 41986, 3), new m("WhiteBalance", 41987, 3), new m("SceneCaptureType", 41990, 3), new m("Contrast", 41992, 3), new m("Saturation", 41993, 3), new m("Sharpness", 41994, 3)};
        m[] mVarArr3 = {new m("GPSVersionID", 0, 1), new m("GPSLatitudeRef", 1, 2), new m(2, "GPSLatitude", 5, 10), new m("GPSLongitudeRef", 3, 2), new m(4, "GPSLongitude", 5, 10), new m("GPSAltitudeRef", 5, 1), new m("GPSAltitude", 6, 5), new m("GPSTimeStamp", 7, 5), new m("GPSSpeedRef", 12, 2), new m("GPSTrackRef", 14, 2), new m("GPSImgDirectionRef", 16, 2), new m("GPSDestBearingRef", 23, 2), new m("GPSDestDistanceRef", 25, 2)};
        f3948c = new m[]{new m("SubIFDPointer", 330, 4), new m("ExifIFDPointer", 34665, 4), new m("GPSInfoIFDPointer", 34853, 4), new m("InteroperabilityIFDPointer", 40965, 4)};
        f3949d = new m[][]{mVarArr, mVarArr2, mVarArr3, new m[]{new m("InteroperabilityIndex", 1, 2)}};
        f3950e = new HashSet<>(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
    }

    public j(ByteOrder byteOrder, ArrayList arrayList) {
        h1.k("Malformed attributes list. Number of IFDs mismatch.", arrayList.size() == 4);
        this.f3952b = byteOrder;
        this.f3951a = arrayList;
    }

    public static j a(androidx.camera.core.j jVar, int i10) {
        a aVar = new a(ByteOrder.BIG_ENDIAN);
        aVar.c("Orientation", String.valueOf(1), aVar.f3957a);
        aVar.c("XResolution", "72/1", aVar.f3957a);
        aVar.c("YResolution", "72/1", aVar.f3957a);
        aVar.c("ResolutionUnit", String.valueOf(2), aVar.f3957a);
        aVar.c("YCbCrPositioning", String.valueOf(1), aVar.f3957a);
        aVar.c("Make", Build.MANUFACTURER, aVar.f3957a);
        aVar.c("Model", Build.MODEL, aVar.f3957a);
        jVar.d0().a(aVar);
        aVar.d(i10);
        aVar.c("ImageWidth", String.valueOf(jVar.f()), aVar.f3957a);
        aVar.c("ImageLength", String.valueOf(jVar.c()), aVar.f3957a);
        ArrayList list = Collections.list(new k(aVar));
        if (!((Map) list.get(1)).isEmpty()) {
            aVar.b("ExposureProgram", String.valueOf(0), list);
            aVar.b("ExifVersion", "0230", list);
            aVar.b("ComponentsConfiguration", "1,2,3,0", list);
            aVar.b("MeteringMode", String.valueOf(0), list);
            aVar.b("LightSource", String.valueOf(0), list);
            aVar.b("FlashpixVersion", "0100", list);
            aVar.b("FocalPlaneResolutionUnit", String.valueOf(2), list);
            aVar.b("FileSource", String.valueOf(3), list);
            aVar.b("SceneType", String.valueOf(1), list);
            aVar.b("CustomRendered", String.valueOf(0), list);
            aVar.b("SceneCaptureType", String.valueOf(0), list);
            aVar.b("Contrast", String.valueOf(0), list);
            aVar.b("Saturation", String.valueOf(0), list);
            aVar.b("Sharpness", String.valueOf(0), list);
        }
        if (!((Map) list.get(2)).isEmpty()) {
            aVar.b("GPSVersionID", "2300", list);
            aVar.b("GPSSpeedRef", "K", list);
            aVar.b("GPSTrackRef", "T", list);
            aVar.b("GPSImgDirectionRef", "T", list);
            aVar.b("GPSDestBearingRef", "T", list);
            aVar.b("GPSDestDistanceRef", "K", list);
        }
        return new j(aVar.f3958b, list);
    }

    public final Map<String, i> b(int i10) {
        h1.g(i10, androidx.activity.i.a("Invalid IFD index: ", i10, ". Index should be between [0, EXIF_TAGS.length] "), 0, 4);
        return this.f3951a.get(i10);
    }
}
