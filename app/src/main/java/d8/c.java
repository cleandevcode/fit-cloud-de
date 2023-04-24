package d8;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = j8.b.l(parcel, readInt);
                    break;
                case 2:
                    str = j8.b.c(parcel, readInt);
                    break;
                case 3:
                    str2 = j8.b.c(parcel, readInt);
                    break;
                case 4:
                    str3 = j8.b.c(parcel, readInt);
                    break;
                case 5:
                    str4 = j8.b.c(parcel, readInt);
                    break;
                case 6:
                    uri = (Uri) j8.b.b(parcel, readInt, Uri.CREATOR);
                    break;
                case 7:
                    str5 = j8.b.c(parcel, readInt);
                    break;
                case '\b':
                    j10 = j8.b.m(parcel, readInt);
                    break;
                case '\t':
                    str6 = j8.b.c(parcel, readInt);
                    break;
                case '\n':
                    arrayList = j8.b.e(parcel, readInt, Scope.CREATOR);
                    break;
                case 11:
                    str7 = j8.b.c(parcel, readInt);
                    break;
                case '\f':
                    str8 = j8.b.c(parcel, readInt);
                    break;
                default:
                    j8.b.o(parcel, readInt);
                    break;
            }
        }
        j8.b.f(parcel, p10);
        return new GoogleSignInAccount(i10, str, str2, str3, str4, uri, str5, j10, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
