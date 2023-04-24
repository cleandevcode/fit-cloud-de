package b0;

import androidx.camera.core.a;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import y.u0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b */
    public static final a f3936b = new a();

    /* renamed from: c */
    public static final b f3937c = new b();

    /* renamed from: d */
    public static final c f3938d = new c();

    /* renamed from: e */
    public static final List<String> f3939e = Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");

    /* renamed from: f */
    public static final List<String> f3940f = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* renamed from: a */
    public final z1.a f3941a;

    /* loaded from: classes.dex */
    public class a extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    /* loaded from: classes.dex */
    public class b extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    /* loaded from: classes.dex */
    public class c extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    public h(z1.a aVar) {
        this.f3941a = aVar;
    }

    public static h b(androidx.camera.core.j jVar) {
        ByteBuffer a10 = ((a.C0021a) jVar.l()[0]).a();
        a10.rewind();
        byte[] bArr = new byte[a10.capacity()];
        a10.get(bArr);
        return new h(new z1.a(new ByteArrayInputStream(bArr)));
    }

    public final void a(h hVar) {
        ArrayList arrayList = new ArrayList(f3939e);
        arrayList.removeAll(f3940f);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String d10 = this.f3941a.d(str);
            if (d10 != null) {
                hVar.f3941a.E(str, d10);
            }
        }
    }

    public final void c() {
        int i10;
        switch (d()) {
            case 2:
                i10 = 1;
                break;
            case 3:
                i10 = 4;
                break;
            case 4:
                i10 = 3;
                break;
            case 5:
                i10 = 6;
                break;
            case 6:
                i10 = 5;
                break;
            case 7:
                i10 = 8;
                break;
            case 8:
                i10 = 7;
                break;
            default:
                i10 = 2;
                break;
        }
        this.f3941a.E("Orientation", String.valueOf(i10));
    }

    public final int d() {
        return this.f3941a.e(0, "Orientation");
    }

    public final int e() {
        switch (d()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public final void f(int i10) {
        z1.a aVar;
        String valueOf;
        if (i10 % 90 != 0) {
            u0.h("h", String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", Integer.valueOf(i10)));
            aVar = this.f3941a;
            valueOf = String.valueOf(0);
        } else {
            int i11 = i10 % 360;
            int d10 = d();
            while (i11 < 0) {
                i11 += 90;
                switch (d10) {
                    case 2:
                        d10 = 5;
                        break;
                    case 3:
                    case 8:
                        d10 = 6;
                        break;
                    case 4:
                        d10 = 7;
                        break;
                    case 5:
                        d10 = 4;
                        break;
                    case 6:
                        d10 = 1;
                        break;
                    case 7:
                        d10 = 2;
                        break;
                    default:
                        d10 = 8;
                        break;
                }
            }
            while (i11 > 0) {
                i11 -= 90;
                switch (d10) {
                    case 2:
                        d10 = 7;
                        break;
                    case 3:
                        d10 = 8;
                        break;
                    case 4:
                        d10 = 5;
                        break;
                    case 5:
                        d10 = 2;
                        break;
                    case 6:
                        d10 = 3;
                        break;
                    case 7:
                        d10 = 4;
                        break;
                    case 8:
                        d10 = 1;
                        break;
                    default:
                        d10 = 6;
                        break;
                }
            }
            aVar = this.f3941a;
            valueOf = String.valueOf(d10);
        }
        aVar.E("Orientation", valueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:242:0x013b A[Catch: all -> 0x0163, Exception -> 0x0166, TryCatch #20 {Exception -> 0x0166, all -> 0x0163, blocks: (B:240:0x0137, B:242:0x013b, B:244:0x0151, B:243:0x014a), top: B:298:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x014a A[Catch: all -> 0x0163, Exception -> 0x0166, TryCatch #20 {Exception -> 0x0166, all -> 0x0163, blocks: (B:240:0x0137, B:242:0x013b, B:244:0x0151, B:243:0x014a), top: B:298:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.h.g():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:1|(1:118)(1:5)|6|(1:8)(1:117)|9|(21:14|15|16|(2:110|111)|18|(1:109)(2:(1:22)(1:108)|23)|24|(2:104|105)|26|(1:28)|29|(11:94|(1:96)(1:(1:99)(2:100|(9:102|(1:34)(8:(1:62)|63|(1:65)|66|(2:68|(2:70|(6:72|(4:76|77|(2:(1:80)(1:82)|81)|83)|84|77|(0)|83)(1:85))(6:87|(4:89|77|(0)|83)|84|77|(0)|83))|90|(1:92)|93)|35|(7:56|57|58|38|(1:40)(3:44|(5:47|48|(2:51|49)|53|54)|46)|41|42)|37|38|(0)(0)|41|42)))|97|(0)(0)|35|(0)|37|38|(0)(0)|41|42)|32|(0)(0)|35|(0)|37|38|(0)(0)|41|42)|116|16|(0)|18|(0)|109|24|(0)|26|(0)|29|(0)|94|(0)(0)|97|(0)(0)|35|(0)|37|38|(0)(0)|41|42) */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x01a1, code lost:
        if (r6.equals("M") != false) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0119 A[Catch: ParseException -> 0x0126, TRY_ENTER, TryCatch #1 {ParseException -> 0x0126, blocks: (B:181:0x0119, B:185:0x0136, B:184:0x012a, B:190:0x0144), top: B:254:0x0117 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x01e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.h.toString():java.lang.String");
    }
}
