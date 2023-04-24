package com.topstep.fitcloud.pro.shared.data.bean.data;

import android.support.v4.media.d;
import com.topstep.fitcloud.pro.model.data.SimpleEcgRecord;
import gm.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.u;
import no.nordicsemi.android.dfu.DfuBaseService;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class FriendTotalDataBean {

    /* renamed from: a */
    public final String f9921a;

    /* renamed from: b */
    public final StepRecordBean f9922b;

    /* renamed from: c */
    public final SleepRecordBean f9923c;

    /* renamed from: d */
    public final HeartRateRecordBean f9924d;

    /* renamed from: e */
    public final OxygenRecordBean f9925e;

    /* renamed from: f */
    public final BloodPressureRecordBean f9926f;

    /* renamed from: g */
    public final TemperatureRecordBean f9927g;

    /* renamed from: h */
    public final PressureRecordBean f9928h;

    /* renamed from: i */
    public final SimpleEcgRecord f9929i;

    public FriendTotalDataBean() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public FriendTotalDataBean(String str, StepRecordBean stepRecordBean, SleepRecordBean sleepRecordBean, HeartRateRecordBean heartRateRecordBean, OxygenRecordBean oxygenRecordBean, BloodPressureRecordBean bloodPressureRecordBean, TemperatureRecordBean temperatureRecordBean, PressureRecordBean pressureRecordBean, SimpleEcgRecord simpleEcgRecord) {
        this.f9921a = str;
        this.f9922b = stepRecordBean;
        this.f9923c = sleepRecordBean;
        this.f9924d = heartRateRecordBean;
        this.f9925e = oxygenRecordBean;
        this.f9926f = bloodPressureRecordBean;
        this.f9927g = temperatureRecordBean;
        this.f9928h = pressureRecordBean;
        this.f9929i = simpleEcgRecord;
    }

    public /* synthetic */ FriendTotalDataBean(String str, StepRecordBean stepRecordBean, SleepRecordBean sleepRecordBean, HeartRateRecordBean heartRateRecordBean, OxygenRecordBean oxygenRecordBean, BloodPressureRecordBean bloodPressureRecordBean, TemperatureRecordBean temperatureRecordBean, PressureRecordBean pressureRecordBean, SimpleEcgRecord simpleEcgRecord, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : stepRecordBean, (i10 & 4) != 0 ? null : sleepRecordBean, (i10 & 8) != 0 ? null : heartRateRecordBean, (i10 & 16) != 0 ? null : oxygenRecordBean, (i10 & 32) != 0 ? null : bloodPressureRecordBean, (i10 & 64) != 0 ? null : temperatureRecordBean, (i10 & 128) != 0 ? null : pressureRecordBean, (i10 & DfuBaseService.ERROR_REMOTE_TYPE_LEGACY) == 0 ? simpleEcgRecord : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FriendTotalDataBean) {
            FriendTotalDataBean friendTotalDataBean = (FriendTotalDataBean) obj;
            return l.a(this.f9921a, friendTotalDataBean.f9921a) && l.a(this.f9922b, friendTotalDataBean.f9922b) && l.a(this.f9923c, friendTotalDataBean.f9923c) && l.a(this.f9924d, friendTotalDataBean.f9924d) && l.a(this.f9925e, friendTotalDataBean.f9925e) && l.a(this.f9926f, friendTotalDataBean.f9926f) && l.a(this.f9927g, friendTotalDataBean.f9927g) && l.a(this.f9928h, friendTotalDataBean.f9928h) && l.a(this.f9929i, friendTotalDataBean.f9929i);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f9921a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        StepRecordBean stepRecordBean = this.f9922b;
        int hashCode2 = (hashCode + (stepRecordBean == null ? 0 : stepRecordBean.hashCode())) * 31;
        SleepRecordBean sleepRecordBean = this.f9923c;
        int hashCode3 = (hashCode2 + (sleepRecordBean == null ? 0 : sleepRecordBean.hashCode())) * 31;
        HeartRateRecordBean heartRateRecordBean = this.f9924d;
        int hashCode4 = (hashCode3 + (heartRateRecordBean == null ? 0 : heartRateRecordBean.hashCode())) * 31;
        OxygenRecordBean oxygenRecordBean = this.f9925e;
        int hashCode5 = (hashCode4 + (oxygenRecordBean == null ? 0 : oxygenRecordBean.hashCode())) * 31;
        BloodPressureRecordBean bloodPressureRecordBean = this.f9926f;
        int hashCode6 = (hashCode5 + (bloodPressureRecordBean == null ? 0 : bloodPressureRecordBean.hashCode())) * 31;
        TemperatureRecordBean temperatureRecordBean = this.f9927g;
        int hashCode7 = (hashCode6 + (temperatureRecordBean == null ? 0 : temperatureRecordBean.hashCode())) * 31;
        PressureRecordBean pressureRecordBean = this.f9928h;
        int hashCode8 = (hashCode7 + (pressureRecordBean == null ? 0 : pressureRecordBean.hashCode())) * 31;
        SimpleEcgRecord simpleEcgRecord = this.f9929i;
        return hashCode8 + (simpleEcgRecord != null ? simpleEcgRecord.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a10 = d.a("FriendTotalDataBean(deviceHardwareInfo=");
        a10.append(this.f9921a);
        a10.append(", step=");
        a10.append(this.f9922b);
        a10.append(", sleep=");
        a10.append(this.f9923c);
        a10.append(", heartRate=");
        a10.append(this.f9924d);
        a10.append(", oxygen=");
        a10.append(this.f9925e);
        a10.append(", bloodPressure=");
        a10.append(this.f9926f);
        a10.append(", temperature=");
        a10.append(this.f9927g);
        a10.append(", pressure=");
        a10.append(this.f9928h);
        a10.append(", ecg=");
        a10.append(this.f9929i);
        a10.append(')');
        return a10.toString();
    }
}
