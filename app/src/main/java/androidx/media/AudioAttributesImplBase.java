package androidx.media;

import androidx.appcompat.widget.u0;
import java.util.Arrays;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f2818a = 0;

    /* renamed from: b */
    public int f2819b = 0;

    /* renamed from: c */
    public int f2820c = 0;

    /* renamed from: d */
    public int f2821d = -1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f2819b != audioAttributesImplBase.f2819b) {
            return false;
        }
        int i10 = this.f2820c;
        int i11 = audioAttributesImplBase.f2820c;
        int i12 = audioAttributesImplBase.f2821d;
        int i13 = 4;
        if (i12 != -1) {
            i13 = i12;
        } else {
            int i14 = audioAttributesImplBase.f2818a;
            int i15 = AudioAttributesCompat.f2814b;
            if ((i11 & 1) == 1) {
                i13 = 7;
            } else if ((i11 & 4) == 4) {
                i13 = 6;
            } else {
                switch (i14) {
                    case 2:
                        i13 = 0;
                        break;
                    case 3:
                        i13 = 8;
                        break;
                    case 4:
                        break;
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        i13 = 5;
                        break;
                    case 6:
                        i13 = 2;
                        break;
                    case 11:
                        i13 = 10;
                        break;
                    case 12:
                    default:
                        i13 = 3;
                        break;
                    case 13:
                        i13 = 1;
                        break;
                }
            }
        }
        if (i13 == 6) {
            i11 |= 4;
        } else if (i13 == 7) {
            i11 |= 1;
        }
        if (i10 != (i11 & 273) || this.f2818a != audioAttributesImplBase.f2818a || this.f2821d != i12) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2819b), Integer.valueOf(this.f2820c), Integer.valueOf(this.f2818a), Integer.valueOf(this.f2821d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f2821d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f2821d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i10 = this.f2818a;
        int i11 = AudioAttributesCompat.f2814b;
        switch (i10) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = u0.a("unknown usage ", i10);
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb2.append(str);
        sb2.append(" content=");
        sb2.append(this.f2819b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f2820c).toUpperCase());
        return sb2.toString();
    }
}
