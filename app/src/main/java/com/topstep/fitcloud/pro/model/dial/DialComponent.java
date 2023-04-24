package com.topstep.fitcloud.pro.model.dial;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import androidx.annotation.Keep;
import fb.b;
import gm.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ul.q;

@Keep
@Metadata
/* loaded from: classes2.dex */
public final class DialComponent implements Parcelable {
    public static final a CREATOR = new a();
    private final int _styleCurrent;
    private final int height;
    private final int positionX;
    private final int positionY;
    private final int styleCount;
    private final List<String> styleUrls;
    private final int width;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<DialComponent> {
        @Override // android.os.Parcelable.Creator
        public final DialComponent createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new DialComponent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DialComponent[] newArray(int i10) {
            return new DialComponent[i10];
        }
    }

    public DialComponent(int i10, int i11, int i12, int i13, int i14, int i15, List<String> list) {
        this.width = i10;
        this.height = i11;
        this.positionX = i12;
        this.positionY = i13;
        this._styleCurrent = i14;
        this.styleCount = i15;
        this.styleUrls = list;
    }

    public /* synthetic */ DialComponent(int i10, int i11, int i12, int i13, int i14, int i15, List list, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, i13, i14, i15, (i16 & 64) != 0 ? null : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialComponent(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createStringArrayList());
        l.f(parcel, "parcel");
    }

    private final int component5() {
        return this._styleCurrent;
    }

    public static /* synthetic */ DialComponent copy$default(DialComponent dialComponent, int i10, int i11, int i12, int i13, int i14, int i15, List list, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i10 = dialComponent.width;
        }
        if ((i16 & 2) != 0) {
            i11 = dialComponent.height;
        }
        int i17 = i11;
        if ((i16 & 4) != 0) {
            i12 = dialComponent.positionX;
        }
        int i18 = i12;
        if ((i16 & 8) != 0) {
            i13 = dialComponent.positionY;
        }
        int i19 = i13;
        if ((i16 & 16) != 0) {
            i14 = dialComponent._styleCurrent;
        }
        int i20 = i14;
        if ((i16 & 32) != 0) {
            i15 = dialComponent.styleCount;
        }
        int i21 = i15;
        List<String> list2 = list;
        if ((i16 & 64) != 0) {
            list2 = dialComponent.styleUrls;
        }
        return dialComponent.copy(i10, i17, i18, i19, i20, i21, list2);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final int component3() {
        return this.positionX;
    }

    public final int component4() {
        return this.positionY;
    }

    public final int component6() {
        return this.styleCount;
    }

    public final List<String> component7() {
        return this.styleUrls;
    }

    public final DialComponent copy(int i10, int i11, int i12, int i13, int i14, int i15, List<String> list) {
        return new DialComponent(i10, i11, i12, i13, i14, i15, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DialComponent) {
            DialComponent dialComponent = (DialComponent) obj;
            return this.width == dialComponent.width && this.height == dialComponent.height && this.positionX == dialComponent.positionX && this.positionY == dialComponent.positionY && this._styleCurrent == dialComponent._styleCurrent && this.styleCount == dialComponent.styleCount && l.a(this.styleUrls, dialComponent.styleUrls);
        }
        return false;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getPositionX() {
        return this.positionX;
    }

    public final int getPositionY() {
        return this.positionY;
    }

    public final int getStyleCount() {
        return this.styleCount;
    }

    public final int getStyleCurrent() {
        List<String> list = this.styleUrls;
        if (list != null) {
            int size = list.size();
            int i10 = this._styleCurrent;
            if (size >= i10) {
                return i10;
            }
        }
        return 0;
    }

    public final String getStyleCurrentUrl() {
        List<String> list = this.styleUrls;
        if (list != null) {
            return (String) q.J(getStyleCurrent(), list);
        }
        return null;
    }

    public final List<String> getStyleUrls() {
        return this.styleUrls;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i10 = ((((((((((this.width * 31) + this.height) * 31) + this.positionX) * 31) + this.positionY) * 31) + this._styleCurrent) * 31) + this.styleCount) * 31;
        List<String> list = this.styleUrls;
        return i10 + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder a10 = d.a("DialComponent(width=");
        a10.append(this.width);
        a10.append(", height=");
        a10.append(this.height);
        a10.append(", positionX=");
        a10.append(this.positionX);
        a10.append(", positionY=");
        a10.append(this.positionY);
        a10.append(", _styleCurrent=");
        a10.append(this._styleCurrent);
        a10.append(", styleCount=");
        a10.append(this.styleCount);
        a10.append(", styleUrls=");
        return b.a(a10, this.styleUrls, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "parcel");
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.positionX);
        parcel.writeInt(this.positionY);
        parcel.writeInt(this._styleCurrent);
        parcel.writeInt(this.styleCount);
        parcel.writeStringList(this.styleUrls);
    }
}
