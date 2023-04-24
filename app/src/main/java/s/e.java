package s;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import b0.j;
import cn.sharesdk.framework.Platform;
import java.nio.BufferUnderflowException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class e implements a0.s {

    /* renamed from: a */
    public final a0.d2 f25937a;

    /* renamed from: b */
    public final CaptureResult f25938b;

    public e(a0.d2 d2Var, CaptureResult captureResult) {
        this.f25937a = d2Var;
        this.f25938b = captureResult;
    }

    @Override // a0.s
    public final void a(j.a aVar) {
        int i10;
        String valueOf;
        Integer num;
        a0.r.a(this, aVar);
        Rect rect = (Rect) this.f25938b.get(CaptureResult.SCALER_CROP_REGION);
        if (rect != null) {
            aVar.c("ImageWidth", String.valueOf(rect.width()), aVar.f3957a);
            aVar.c("ImageLength", String.valueOf(rect.height()), aVar.f3957a);
        }
        try {
            Integer num2 = (Integer) this.f25938b.get(CaptureResult.JPEG_ORIENTATION);
            if (num2 != null) {
                aVar.d(num2.intValue());
            }
        } catch (BufferUnderflowException unused) {
            y.u0.h("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l10 = (Long) this.f25938b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l10 != null) {
            aVar.c("ExposureTime", String.valueOf(l10.longValue() / TimeUnit.SECONDS.toNanos(1L)), aVar.f3957a);
        }
        Float f10 = (Float) this.f25938b.get(CaptureResult.LENS_APERTURE);
        if (f10 != null) {
            aVar.c("FNumber", String.valueOf(f10.floatValue()), aVar.f3957a);
        }
        Integer num3 = (Integer) this.f25938b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num3 != null) {
            if (Build.VERSION.SDK_INT >= 24 && (num = (Integer) this.f25938b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                num3 = Integer.valueOf(num3.intValue() * ((int) (num.intValue() / 100.0f)));
            }
            int intValue = num3.intValue();
            aVar.c("SensitivityType", String.valueOf(3), aVar.f3957a);
            aVar.c("PhotographicSensitivity", String.valueOf(Math.min((int) Platform.CUSTOMER_ACTION_MASK, intValue)), aVar.f3957a);
        }
        Float f11 = (Float) this.f25938b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f11 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f11.floatValue() * 1000.0f);
            sb2.append("/");
            sb2.append(1000L);
            aVar.c("FocalLength", sb2.toString(), aVar.f3957a);
        }
        Integer num4 = (Integer) this.f25938b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num4 != null) {
            if (num4.intValue() == 0) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            int b10 = c0.b(i10);
            if (b10 != 0) {
                if (b10 != 1) {
                    valueOf = null;
                } else {
                    valueOf = String.valueOf(1);
                }
            } else {
                valueOf = String.valueOf(0);
            }
            aVar.c("WhiteBalance", valueOf, aVar.f3957a);
        }
    }

    @Override // a0.s
    public final a0.d2 b() {
        return this.f25937a;
    }

    public final int c() {
        Integer num = (Integer) this.f25938b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return 1;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return 3;
            }
            if (intValue == 3 || intValue == 4) {
                return 4;
            }
            if (intValue != 5) {
                y.u0.b("C2CameraCaptureResult", "Undefined af mode: " + num);
                return 1;
            }
        }
        return 2;
    }

    @Override // a0.s
    public final long d() {
        Long l10 = (Long) this.f25938b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l10 == null) {
            return -1L;
        }
        return l10.longValue();
    }

    @Override // a0.s
    public final a0.p e() {
        a0.p pVar = a0.p.UNKNOWN;
        Integer num = (Integer) this.f25938b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return pVar;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        y.u0.b("C2CameraCaptureResult", "Undefined awb state: " + num);
                        return pVar;
                    }
                    return a0.p.LOCKED;
                }
                return a0.p.CONVERGED;
            }
            return a0.p.METERING;
        }
        return a0.p.INACTIVE;
    }

    @Override // a0.s
    public final int f() {
        Integer num = (Integer) this.f25938b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return 1;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return 2;
        }
        if (intValue != 2) {
            if (intValue == 3 || intValue == 4) {
                return 4;
            }
            y.u0.b("C2CameraCaptureResult", "Undefined flash state: " + num);
            return 1;
        }
        return 3;
    }

    @Override // a0.s
    public final a0.n g() {
        a0.n nVar = a0.n.UNKNOWN;
        Integer num = (Integer) this.f25938b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return nVar;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    return a0.n.CONVERGED;
                }
                if (intValue == 3) {
                    return a0.n.LOCKED;
                }
                if (intValue == 4) {
                    return a0.n.FLASH_REQUIRED;
                }
                if (intValue != 5) {
                    y.u0.b("C2CameraCaptureResult", "Undefined ae state: " + num);
                    return nVar;
                }
            }
            return a0.n.SEARCHING;
        }
        return a0.n.INACTIVE;
    }

    @Override // a0.s
    public final CaptureResult h() {
        return this.f25938b;
    }

    @Override // a0.s
    public final a0.o i() {
        a0.o oVar = a0.o.UNKNOWN;
        Integer num = (Integer) this.f25938b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return oVar;
        }
        switch (num.intValue()) {
            case 0:
                return a0.o.INACTIVE;
            case 1:
            case 3:
                return a0.o.SCANNING;
            case 2:
                return a0.o.PASSIVE_FOCUSED;
            case 4:
                return a0.o.LOCKED_FOCUSED;
            case 5:
                return a0.o.LOCKED_NOT_FOCUSED;
            case 6:
                return a0.o.PASSIVE_NOT_FOCUSED;
            default:
                y.u0.b("C2CameraCaptureResult", "Undefined af state: " + num);
                return oVar;
        }
    }
}
