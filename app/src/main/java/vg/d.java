package vg;

import co.o;
import co.q;
import co.t;
import com.topstep.fitcloud.pro.model.data.EcgReport;
import com.topstep.fitcloud.pro.model.data.SimpleEcgRecord;
import com.topstep.fitcloud.pro.model.data.SportGoal;
import com.topstep.fitcloud.pro.model.data.SportRecord;
import com.topstep.fitcloud.pro.model.data.SportTotal;
import com.topstep.fitcloud.pro.model.device.DeviceShellSpecify;
import com.topstep.fitcloud.pro.model.dial.DialPacket;
import com.topstep.fitcloud.pro.model.friend.Friend;
import com.topstep.fitcloud.pro.model.friend.FriendMsg;
import com.topstep.fitcloud.pro.model.game.push.GamePacket;
import com.topstep.fitcloud.pro.model.sport.push.SportPacket;
import com.topstep.fitcloud.pro.shared.data.bean.CityBean;
import com.topstep.fitcloud.pro.shared.data.bean.DeviceBindBean;
import com.topstep.fitcloud.pro.shared.data.bean.DialCustomStyleBean;
import com.topstep.fitcloud.pro.shared.data.bean.DialPacketComplexBean;
import com.topstep.fitcloud.pro.shared.data.bean.ExerciseGoalBean;
import com.topstep.fitcloud.pro.shared.data.bean.TokenBean;
import com.topstep.fitcloud.pro.shared.data.bean.UnitConfigBean;
import com.topstep.fitcloud.pro.shared.data.bean.UserBean;
import com.topstep.fitcloud.pro.shared.data.bean.VersionBean;
import com.topstep.fitcloud.pro.shared.data.bean.WeatherBean;
import com.topstep.fitcloud.pro.shared.data.bean.data.BloodPressureRecordBean;
import com.topstep.fitcloud.pro.shared.data.bean.data.EcgRecordBean;
import com.topstep.fitcloud.pro.shared.data.bean.data.FriendTotalDataBean;
import com.topstep.fitcloud.pro.shared.data.bean.data.HeartRateRecordBean;
import com.topstep.fitcloud.pro.shared.data.bean.data.OxygenRecordBean;
import com.topstep.fitcloud.pro.shared.data.bean.data.PressureRecordBean;
import com.topstep.fitcloud.pro.shared.data.bean.data.SleepRecordBean;
import com.topstep.fitcloud.pro.shared.data.bean.data.StepRecordBean;
import com.topstep.fitcloud.pro.shared.data.bean.data.TemperatureRecordBean;
import kotlin.Metadata;
import zm.t;

@Metadata
/* loaded from: classes2.dex */
public interface d {
    @o("/auth/login2")
    @co.e
    Object A(@co.c("openAppId") String str, @co.c("openAppName") String str2, @co.c("channelId") int i10, @co.c("platform") int i11, xl.d<? super k<TokenBean>> dVar);

    @o("/temperature/upload")
    @co.e
    Object B(@co.i("userId") long j10, @co.c("data") String str, xl.d<? super f> dVar);

    @o("/user/syncBindDeviceConfig")
    @co.e
    Object C(@co.i("userId") long j10, @co.c("deviceAddress") String str, @co.c("deviceName") String str2, @co.c("deviceHardwareInfo") String str3, @co.c("deviceBind") int i10, @co.c("deviceLastModifyTime") long j11, xl.d<? super k<DeviceBindBean>> dVar);

    @o("/relation/totalData")
    @co.e
    Object D(@co.i("userId") long j10, @co.c("userId") long j11, xl.d<? super k<FriendTotalDataBean>> dVar);

    @o("/sport/upload")
    @co.e
    Object E(@co.i("userId") long j10, @co.c("data") String str, xl.d<? super f> dVar);

    @o("/relation/remove")
    @co.e
    Object F(@co.i("userId") long j10, @co.c("userId") long j11, xl.d<? super f> dVar);

    @o("/bloodpressure/upload")
    @co.e
    Object G(@co.i("userId") long j10, @co.c("data") String str, xl.d<? super f> dVar);

    @o("/bloodpressure/get/v4")
    @co.e
    Object H(@co.i("userId") long j10, @co.c("friendId") long j11, @co.c("startDate") String str, @co.c("endDate") String str2, @co.c("needDetail") boolean z10, xl.d<? super i<BloodPressureRecordBean>> dVar);

    @o("/relation/list")
    Object I(@co.i("userId") long j10, xl.d<? super i<Friend>> dVar);

    @o("/oxygen/get/v4")
    @co.e
    Object J(@co.i("userId") long j10, @co.c("friendId") long j11, @co.c("startDate") String str, @co.c("endDate") String str2, @co.c("needDetail") boolean z10, xl.d<? super i<OxygenRecordBean>> dVar);

    @o("/sport/getTotal")
    Object K(@co.i("userId") long j10, xl.d<? super k<SportTotal>> dVar);

    @o("/oxygen/get/v4")
    @co.e
    Object L(@co.i("userId") long j10, @co.c("startDate") String str, @co.c("endDate") String str2, @co.c("needDetail") boolean z10, xl.d<? super i<OxygenRecordBean>> dVar);

    @o("/public/dial/list")
    @co.e
    Object M(@co.c("hardwareInfo") String str, @co.c("lcd") int i10, @co.c("toolVersion") String str2, xl.d<? super i<DialPacket>> dVar);

    @o("/relation/info")
    @co.e
    Object N(@co.i("userId") long j10, @co.c("userId") long j11, xl.d<? super l<Friend>> dVar);

    @o("/heartrate/upload")
    @co.e
    Object O(@co.i("userId") long j10, @co.c("data") String str, xl.d<? super f> dVar);

    @o("/oxygen/upload")
    @co.e
    Object P(@co.i("userId") long j10, @co.c("data") String str, xl.d<? super f> dVar);

    @o("/user/selfDelete")
    @co.e
    Object Q(@co.i("userId") long j10, @co.c("password") String str, xl.d<? super f> dVar);

    @o("/temperature/get/v4")
    @co.e
    Object R(@co.i("userId") long j10, @co.c("startDate") String str, @co.c("endDate") String str2, @co.c("needDetail") boolean z10, xl.d<? super i<TemperatureRecordBean>> dVar);

    @o("/sleep/get/v4")
    @co.e
    Object S(@co.i("userId") long j10, @co.c("startTime") String str, @co.c("endTime") String str2, @co.c("needDetail") boolean z10, xl.d<? super i<SleepRecordBean>> dVar);

    @o("/user/syncTargetConfig")
    @co.e
    Object T(@co.i("userId") long j10, @co.c("stepTarget") int i10, @co.c("distanceTarget") float f10, @co.c("calorieTarget") int i11, @co.c("targetLastModifyTime") long j11, xl.d<? super k<ExerciseGoalBean>> dVar);

    @o("/sport/get/v4")
    @co.e
    Object U(@co.i("userId") long j10, @co.c("page") int i10, @co.c("pageSize") int i11, xl.d<? super i<SportRecord>> dVar);

    @o("/user/rebind")
    @co.e
    Object V(@co.i("userId") long j10, @co.c("userName") String str, @co.c("authCode") String str2, @co.c("password") String str3, xl.d<? super f> dVar);

    @o("/auth/refreshToken")
    @co.e
    ao.b<k<TokenBean>> W(@co.c("refreshToken") String str);

    @o("/user/syncUnitConfig")
    @co.e
    Object X(@co.i("userId") long j10, @co.c("lengthUnit") int i10, @co.c("weightUnit") int i11, @co.c("temperatureUnit") int i12, @co.c("unitLastModifyTime") long j11, xl.d<? super k<UnitConfigBean>> dVar);

    @o("/relation/msg")
    Object Y(@co.i("userId") long j10, xl.d<? super i<FriendMsg>> dVar);

    @o("/step/upload")
    @co.e
    Object Z(@co.i("userId") long j10, @co.c("data") String str, xl.d<? super f> dVar);

    @o("/wxma/generateUrlLink")
    @co.e
    Object a(@co.i("userId") long j10, @co.c("envVersion") String str, xl.d<? super k<String>> dVar);

    @o("/public/device/shell/v2")
    @co.e
    Object a0(@co.c("appName") String str, xl.d<? super i<DeviceShellSpecify>> dVar);

    @o("/user/syncUserInfo")
    @co.e
    Object b(@co.i("Authorization") String str, @co.c("lastModifyTime") long j10, xl.d<? super k<UserBean>> dVar);

    @o("/auth/requestAuthCode ")
    @co.e
    Object b0(@co.c("userName") String str, @co.c("language") String str2, xl.d<? super f> dVar);

    @o("/ecg/get/v4")
    @co.e
    Object c(@co.i("userId") long j10, @co.c("startTime") String str, @co.c("endTime") String str2, xl.d<? super i<SimpleEcgRecord>> dVar);

    @o("/user/setIdentity")
    @co.e
    Object c0(@co.i("userId") long j10, @co.c("identityId") String str, xl.d<? super f> dVar);

    @o("/user/getBindDeviceConfig")
    Object d(@co.i("userId") long j10, xl.d<? super l<DeviceBindBean>> dVar);

    @o("/relation/reject")
    @co.e
    Object d0(@co.i("userId") long j10, @co.c("applyId") long j11, xl.d<? super f> dVar);

    @o("/public/dial/customgui")
    @co.e
    Object e(@co.c("lcd") int i10, @co.c("toolVersion") String str, xl.d<? super i<DialPacketComplexBean>> dVar);

    @o("/ecg/getDetail")
    @co.e
    Object e0(@co.i("userId") long j10, @co.c("friendId") long j11, @co.c("ecgId") String str, xl.d<? super l<EcgRecordBean>> dVar);

    @o("/relation/rename")
    @co.e
    Object f(@co.i("userId") long j10, @co.c("userId") long j11, @co.c("mark") String str, xl.d<? super f> dVar);

    @o("/sport/getGoal")
    Object f0(@co.i("userId") long j10, xl.d<? super i<SportGoal>> dVar);

    @o("/temperature/get/v4")
    @co.e
    Object g(@co.i("userId") long j10, @co.c("friendId") long j11, @co.c("startDate") String str, @co.c("endDate") String str2, @co.c("needDetail") boolean z10, xl.d<? super i<TemperatureRecordBean>> dVar);

    @o("/auth/register ")
    @co.e
    Object g0(@co.c("userName") String str, @co.c("password") String str2, @co.c("authCode") String str3, @co.c("checkAuthCode") boolean z10, @co.c("channelId") int i10, @co.c("platform") int i11, xl.d<? super k<TokenBean>> dVar);

    @o("/heartrate/get/v4")
    @co.e
    Object h(@co.i("userId") long j10, @co.c("friendId") long j11, @co.c("startDate") String str, @co.c("endDate") String str2, @co.c("needDetail") boolean z10, xl.d<? super i<HeartRateRecordBean>> dVar);

    @o("/user/syncUserInfo")
    @co.e
    Object h0(@co.i("Authorization") String str, @co.c("nickName") String str2, @co.c("sex") Integer num, @co.c("birthday") String str3, @co.c("height") Float f10, @co.c("weight") Float f11, @co.c("avatar") String str4, @co.c("lastModifyTime") long j10, xl.d<? super k<UserBean>> dVar);

    @o("/relation/check")
    @co.e
    Object i(@co.i("userId") long j10, @co.c("userId") long j11, xl.d<? super k<Integer>> dVar);

    @o("/auth/resetPassword ")
    @co.e
    Object i0(@co.c("userName") String str, @co.c("password") String str2, @co.c("authCode") String str3, @co.c("channelId") int i10, xl.d<? super f> dVar);

    @o("/public/dial/get")
    @co.e
    Object j(@co.c("data") String str, xl.d<? super i<DialPacketComplexBean>> dVar);

    @o("/relation/accept")
    @co.e
    Object j0(@co.i("userId") long j10, @co.c("applyId") long j11, xl.d<? super f> dVar);

    @o("/sport/getDetail")
    @co.e
    Object k(@co.i("userId") long j10, @co.c("sportId") String str, xl.d<? super k<SportRecord>> dVar);

    @o("/step/get/v4")
    @co.e
    Object k0(@co.i("userId") long j10, @co.c("startDate") String str, @co.c("endDate") String str2, xl.d<? super i<StepRecordBean>> dVar);

    @o("/user/selfDelete2")
    @co.e
    Object l(@co.i("userId") long j10, @co.c("openAppName") String str, @co.c("openAppId") String str2, xl.d<? super f> dVar);

    @o("/ecg/getReport")
    @co.e
    Object l0(@co.i("userId") long j10, @co.c("friendId") long j11, @co.c("ecgId") String str, @co.c("language") String str2, xl.d<? super i<EcgReport>> dVar);

    @o("/pressure/get/v4")
    @co.e
    Object m(@co.i("userId") long j10, @co.c("startDate") String str, @co.c("endDate") String str2, @co.c("needDetail") boolean z10, xl.d<? super i<PressureRecordBean>> dVar);

    @o("/ecg/getDetail")
    @co.e
    Object m0(@co.i("userId") long j10, @co.c("ecgId") String str, xl.d<? super k<EcgRecordBean>> dVar);

    @o("/user/changePassword")
    @co.e
    Object n(@co.i("userId") long j10, @co.c("oldPassword") String str, @co.c("newPassword") String str2, xl.d<? super f> dVar);

    @o("/public/sportbin/list")
    @co.e
    Object n0(@co.c("hardwareInfo") String str, xl.d<? super i<SportPacket>> dVar);

    @o("/public/feedback")
    @co.e
    Object o(@co.c("contact") String str, @co.c("text") String str2, @co.c("images") String str3, @co.c("files") String str4, @co.c("osInfo") String str5, @co.c("phoneModel") String str6, @co.c("appVersion") String str7, @co.c("hardwareInfo") String str8, xl.d<? super f> dVar);

    @co.l
    @o("/public/uploadFile")
    Object o0(@t("fileType") int i10, @q t.c cVar, xl.d<? super k<String>> dVar);

    @o("/public/feedback")
    @co.e
    Object p(@co.i("userId") long j10, @co.c("contact") String str, @co.c("text") String str2, @co.c("images") String str3, @co.c("files") String str4, @co.c("osInfo") String str5, @co.c("phoneModel") String str6, @co.c("appVersion") String str7, @co.c("hardwareInfo") String str8, xl.d<? super f> dVar);

    @o("/pressure/get/v4")
    @co.e
    Object p0(@co.i("userId") long j10, @co.c("friendId") long j11, @co.c("startDate") String str, @co.c("endDate") String str2, @co.c("needDetail") boolean z10, xl.d<? super i<PressureRecordBean>> dVar);

    @o("/relation/send")
    @co.e
    Object q(@co.i("userId") long j10, @co.c("userId") long j11, @co.c("mark") String str, @co.c("message") String str2, xl.d<? super f> dVar);

    @o("/auth/checkExist")
    @co.e
    Object q0(@co.c("userName") String str, @co.c("channelId") int i10, xl.d<? super k<Integer>> dVar);

    @o("/user/syncUserInfo")
    @co.e
    Object r(@co.i("userId") long j10, @co.c("nickName") String str, @co.c("sex") Integer num, @co.c("birthday") String str2, @co.c("height") Float f10, @co.c("weight") Float f11, @co.c("avatar") String str3, @co.c("lastModifyTime") long j11, xl.d<? super k<UserBean>> dVar);

    @o("/heartrate/get/v4")
    @co.e
    Object r0(@co.i("userId") long j10, @co.c("startDate") String str, @co.c("endDate") String str2, @co.c("needDetail") boolean z10, xl.d<? super i<HeartRateRecordBean>> dVar);

    @o("/auth/login")
    @co.e
    Object s(@co.c("userName") String str, @co.c("password") String str2, @co.c("channelId") int i10, @co.c("platform") int i11, xl.d<? super k<TokenBean>> dVar);

    @o("/ecg/getReport")
    @co.e
    Object s0(@co.i("userId") long j10, @co.c("ecgId") String str, @co.c("language") String str2, xl.d<? super i<EcgReport>> dVar);

    @o("/ecg/get/v4")
    @co.e
    Object t(@co.i("userId") long j10, @co.c("friendId") long j11, @co.c("startTime") String str, @co.c("endTime") String str2, xl.d<? super i<SimpleEcgRecord>> dVar);

    @co.f("/public/getHeWeather/v4")
    Object t0(@co.t("cid") String str, @co.t("forecast") int i10, xl.d<? super k<WeatherBean>> dVar);

    @o("/public/game/list")
    @co.e
    Object u(@co.c("hardwareInfo") String str, @co.c("lang") String str2, xl.d<? super i<GamePacket>> dVar);

    @o("/public/dial/custom")
    @co.e
    Object u0(@co.c("lcd") int i10, @co.c("toolVersion") String str, xl.d<? super i<DialCustomStyleBean>> dVar);

    @o("/relation/readMsg")
    @co.e
    Object v(@co.i("userId") long j10, @co.c("time") long j11, xl.d<? super f> dVar);

    @o("/sport/syncGoal")
    @co.e
    Object v0(@co.i("userId") long j10, @co.c("data") String str, xl.d<? super f> dVar);

    @o("/public/getHeCity")
    @co.e
    Object w(@co.c("location") String str, xl.d<? super k<CityBean>> dVar);

    @o("/relation/search")
    @co.e
    Object w0(@co.i("userId") long j10, @co.c("content") String str, xl.d<? super i<UserBean>> dVar);

    @o("/public/device/shell")
    @co.e
    Object x(@co.c("hardwareInfo") String str, xl.d<? super l<String>> dVar);

    @o("/public/checkVersion/v2")
    @co.e
    Object x0(@co.c("androidPackage") String str, @co.c("hardwareInfo") String str2, @co.c("uiVersion") String str3, xl.d<? super l<VersionBean>> dVar);

    @o("/pressure/upload")
    @co.e
    Object y(@co.i("userId") long j10, @co.c("data") String str, xl.d<? super f> dVar);

    @o("/bloodpressure/get/v4")
    @co.e
    Object y0(@co.i("userId") long j10, @co.c("startDate") String str, @co.c("endDate") String str2, @co.c("needDetail") boolean z10, xl.d<? super i<BloodPressureRecordBean>> dVar);

    @o("/ecg/upload")
    @co.e
    Object z(@co.i("userId") long j10, @co.c("data") String str, xl.d<? super f> dVar);

    @o("/sleep/upload")
    @co.e
    Object z0(@co.i("userId") long j10, @co.c("data") String str, xl.d<? super f> dVar);
}
