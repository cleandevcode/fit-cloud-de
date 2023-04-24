package qj;

import hj.o;

/* loaded from: classes2.dex */
public final class a {
    public boolean A;
    public boolean B;
    public boolean C;

    /* renamed from: a */
    public e f24880a;

    /* renamed from: b */
    public int f24881b;

    /* renamed from: c */
    public int f24882c;

    /* renamed from: d */
    public int f24883d;

    /* renamed from: e */
    public d f24884e;

    /* renamed from: f */
    public int f24885f;

    /* renamed from: g */
    public String f24886g;

    /* renamed from: h */
    public int f24887h;

    /* renamed from: i */
    public int f24888i;

    /* renamed from: j */
    public boolean f24889j;

    /* renamed from: k */
    public int f24890k;

    /* renamed from: l */
    public int f24891l;

    /* renamed from: m */
    public boolean f24892m;

    /* renamed from: n */
    public b f24893n;

    /* renamed from: o */
    public int f24894o;

    /* renamed from: p */
    public C0451a f24895p;

    /* renamed from: q */
    public int f24896q;

    /* renamed from: r */
    public int f24897r;

    /* renamed from: s */
    public int f24898s;

    /* renamed from: t */
    public c f24899t;

    /* renamed from: u */
    public int f24900u;

    /* renamed from: v */
    public int f24901v;

    /* renamed from: w */
    public int f24902w;

    /* renamed from: x */
    public int f24903x;

    /* renamed from: y */
    public int f24904y;

    /* renamed from: z */
    public boolean f24905z;

    /* renamed from: qj.a$a */
    /* loaded from: classes2.dex */
    public static class C0451a {

        /* renamed from: a */
        public int f24906a;

        /* renamed from: b */
        public int f24907b;

        /* renamed from: c */
        public int f24908c;

        /* renamed from: d */
        public int f24909d;

        /* renamed from: e */
        public int f24910e;

        /* renamed from: f */
        public int f24911f;
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        public int f24912a;

        /* renamed from: b */
        public String f24913b;

        /* renamed from: c */
        public int f24914c;

        /* renamed from: d */
        public boolean f24915d;

        /* renamed from: e */
        public boolean f24916e;
    }

    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a */
        public int f24917a;

        /* renamed from: b */
        public int f24918b;

        /* renamed from: c */
        public boolean f24919c;

        /* renamed from: d */
        public int f24920d;

        /* renamed from: e */
        public int f24921e;

        /* renamed from: f */
        public int f24922f;

        /* renamed from: g */
        public int f24923g;
    }

    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a */
        public int f24924a;

        /* renamed from: b */
        public boolean f24925b;

        /* renamed from: c */
        public boolean f24926c;

        /* renamed from: d */
        public boolean f24927d;

        /* renamed from: e */
        public boolean f24928e;

        /* renamed from: f */
        public boolean f24929f;

        /* renamed from: g */
        public boolean f24930g;

        /* renamed from: h */
        public String f24931h;
    }

    /* loaded from: classes2.dex */
    public static class e {

        /* renamed from: a */
        public int f24932a;

        /* renamed from: b */
        public int f24933b;

        /* renamed from: c */
        public int f24934c;

        /* renamed from: d */
        public String f24935d;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder a10 = android.support.v4.media.d.a("0x01 翻译版本信息:\n");
        if (this.f24880a == null) {
            a10.append("    --");
        } else {
            a10.append("    客户编号:");
            a10.append(this.f24880a.f24932a);
            a10.append("\n");
            a10.append("    客户翻译编号:");
            a10.append(this.f24880a.f24933b);
            a10.append("\n");
            a10.append("    翻译版本号:");
            a10.append(this.f24880a.f24934c);
            a10.append("\n");
            a10.append("    编译时间序号:");
            a10.append(this.f24880a.f24935d);
        }
        p0.a.a(a10, "\n", "\n", "0x02 Flash信息:\n");
        int i10 = this.f24881b;
        String str3 = "--";
        String str4 = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "--" : "256M" : "128M" : "64M" : "32M";
        int i11 = this.f24882c;
        String str5 = i11 != 1 ? i11 != 2 ? i11 != 3 ? "--" : "1M" : "500KB" : "300KB";
        o.a(a10, "    flash大小:", str4, "\n", "    代码空间大小:");
        o.a(a10, str5, "\n", "\n", "0x03 字库信息:\n");
        int i12 = this.f24883d;
        o.a(a10, "    字库类型:", i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? "--" : "7号字库" : "6号字库" : "5号字库" : "3号字库", "\n", "\n");
        a10.append("0x04 TP信息:\n");
        d dVar = this.f24884e;
        if (dVar == null) {
            a10.append("    --");
        } else {
            int i13 = dVar.f24924a;
            o.a(a10, "    TP型号:", i13 != 1 ? i13 != 2 ? i13 != 3 ? "--" : "海栎创716" : "海栎创816S" : "新联阳7259E", "\n", "    是否COB:");
            p0.a.a(a10, this.f24884e.f24925b ? "Y" : "N", "\n", "    TP是否可以开机:");
            p0.a.a(a10, this.f24884e.f24926c ? "Y" : "N", "\n", "    TP是否可以唤醒:");
            p0.a.a(a10, this.f24884e.f24927d ? "Y" : "N", "\n", "    TP是否打开升级:");
            p0.a.a(a10, this.f24884e.f24928e ? "Y" : "N", "\n", "    手环TP测试页面:");
            p0.a.a(a10, this.f24884e.f24929f ? "Y" : "N", "\n", "    TP复位脚复用屏幕RD:");
            p0.a.a(a10, this.f24884e.f24930g ? "Y" : "N", "\n", "    TP固件版本:");
            a10.append(this.f24884e.f24931h);
        }
        p0.a.a(a10, "\n", "\n", "0x05 计步算法信息:\n");
        int i14 = this.f24885f;
        o.a(a10, "    计步算法类型:", i14 != 1 ? i14 != 2 ? "--" : "YC计步算法" : "陈工算法", "\n", "    计步算法库版本:");
        o.a(a10, this.f24886g, "\n", "\n", "0x06 抬腕算法信息:\n");
        int i15 = this.f24887h;
        o.a(a10, "    抬腕算法类型:", i15 != 1 ? i15 != 2 ? "--" : "YC抬腕算法" : "拓步抬腕算法", "\n", "\n");
        a10.append("0x07 卡路里算法信息:\n");
        int i16 = this.f24888i;
        o.a(a10, "    卡路里算法类型:", i16 != 1 ? i16 != 2 ? "--" : "YC算法库距离卡路里算法" : "拓步卡路里距离算法", "\n", "    运动模式优化卡路里:");
        p0.a.a(a10, this.f24889j ? "Y" : "N", "\n", "    运动模式优化卡路里算法版本:");
        a10.append(this.f24890k);
        a10.append("\n");
        a10.append("\n");
        a10.append("0x08 睡眠算法信息:\n");
        int i17 = this.f24891l;
        o.a(a10, "    睡眠算法类型:", i17 != 1 ? i17 != 2 ? "--" : "YC睡眠算法" : "拓步睡眠算法", "\n", "    睡眠支持多段叠加:");
        o.a(a10, this.f24892m ? "Y" : "N", "\n", "\n", "0x09 心率信息:\n");
        b bVar = this.f24893n;
        if (bVar == null) {
            a10.append("    --");
        } else {
            int i18 = bVar.f24912a;
            if (i18 == 1) {
                str = "em7028/em7029/em1029";
            } else if (i18 == 33) {
                str = "bd1662";
            } else if (i18 != 49) {
                switch (i18) {
                    case 17:
                        str = "hrs3300/hrs3301";
                        break;
                    case 18:
                        str = "hrs3313";
                        break;
                    case 19:
                        str = "hrs3313lp";
                        break;
                    case 20:
                        str = "hrs3600";
                        break;
                    case 21:
                        str = "hrs3603";
                        break;
                    default:
                        str = "--";
                        break;
                }
            } else {
                str = "vc31";
            }
            o.a(a10, "    心率型号:", str, "\n", "    心率算法库版本:");
            a10.append(this.f24893n.f24913b);
            a10.append("\n");
            int i19 = this.f24893n.f24914c;
            o.a(a10, "    是否有心率开关:", i19 != 0 ? i19 != 1 ? i19 != 2 ? "--" : "有且复用RD 脚" : "有" : "无", "\n", "    是否有中断脚:");
            p0.a.a(a10, this.f24893n.f24915d ? "Y" : "N", "\n", "    心率热插拔:");
            a10.append(this.f24893n.f24916e ? "Y" : "N");
        }
        p0.a.a(a10, "\n", "\n", "0x0A gsensor信息:\n");
        int i20 = this.f24894o;
        o.a(a10, "    gsensor类型:", i20 != 1 ? i20 != 2 ? i20 != 3 ? i20 != 4 ? i20 != 5 ? "--" : "sc7a20" : "bma253" : "lis2dh" : "kx1020" : "stk8321", "\n", "\n");
        a10.append("0x0B 充电信息:\n");
        C0451a c0451a = this.f24895p;
        if (c0451a == null) {
            a10.append("    --");
            a10.append("\n");
        } else {
            switch (c0451a.f24906a) {
                case 1:
                    str2 = "正常一个充电状态脚";
                    break;
                case 2:
                    str2 = "正常一充电状态脚+5V状态脚";
                    break;
                case 3:
                    str2 = "LTC充电方式";
                    break;
                case 4:
                    str2 = "圣邦微40561两个脚充电方式";
                    break;
                case 5:
                    str2 = "NJY无线充电方式";
                    break;
                case 6:
                    str2 = "XC5015两个管脚充电方式";
                    break;
                default:
                    str2 = "--";
                    break;
            }
            o.a(a10, "    充电类型:", str2, "\n", "    充电逻辑版本:");
            a10.append(this.f24895p.f24907b);
            a10.append("\n");
            int i21 = this.f24895p.f24908c;
            p0.a.a(a10, "    电池满电电压:", i21 != 0 ? i21 != 1 ? "--" : "4.35V" : "4.2V", "\n");
            int i22 = this.f24895p.f24909d;
            o.a(a10, "    充电曲线:", i22 != 0 ? i22 != 1 ? "--" : "HSD曲线" : "拓步标准曲线", "\n", "    电池当前电压:");
            a10.append(this.f24895p.f24910e);
            a10.append("mv\n");
            a10.append("    电池当前电量百分:");
            a10.append(this.f24895p.f24911f);
            a10.append("%\n");
        }
        a10.append("\n");
        a10.append("0x0C 屏幕TP热插拔信息:\n");
        int i23 = this.f24896q;
        o.a(a10, "    屏幕TP热插拔:", i23 != 0 ? i23 != 1 ? i23 != 2 ? "--" : "充电时热插拔复位;(只有充电时复位屏幕初始化)" : "支持;(每次亮屏都复位屏幕初始化)" : "不支持", "\n", "\n");
        a10.append("0x0D 血压算法信息:\n");
        int i24 = this.f24897r;
        o.a(a10, "    血压算法类型:", i24 != 0 ? i24 != 1 ? "--" : "CK18血压算法" : "拓步标准血压算法", "\n", "\n");
        a10.append("0x0E 天线信号强度信息:\n");
        int i25 = this.f24898s;
        o.a(a10, "    天线信号强度:", i25 != 0 ? i25 != 1 ? i25 != 2 ? "--" : "7.5dB" : "4dB" : "0dB", "\n", "\n");
        a10.append("0x0F 屏幕信息:\n");
        if (this.f24899t == null) {
            a10.append("    --");
        } else {
            a10.append("    屏幕型号:");
            a10.append(this.f24899t.f24917a);
            a10.append("\n");
            a10.append("    屏幕驱动编号:");
            a10.append(this.f24899t.f24918b);
            a10.append("\n");
            a10.append("    屏幕是否使能TE信号:");
            a10.append(this.f24899t.f24919c ? "Y" : "N");
            a10.append("\n");
            int i26 = this.f24899t.f24920d;
            o.a(a10, "    并口屏幕RD脚是否复用:", i26 != 0 ? i26 != 1 ? i26 != 2 ? "--" : "复用为TP复位脚" : "复用为心率开关脚" : "否", "\n", "    默认亮度:");
            a10.append(this.f24899t.f24921e);
            a10.append("\n");
            a10.append("    默认亮屏时间:");
            a10.append(this.f24899t.f24922f);
            a10.append("\n");
            a10.append("    默认翻腕亮屏时间:");
            a10.append(this.f24899t.f24923g);
        }
        p0.a.a(a10, "\n", "\n", "0x10 体温信息:\n");
        int i27 = this.f24900u;
        p0.a.a(a10, "    体温型号:", i27 != 0 ? i27 != 1 ? i27 != 2 ? "--" : "金开盛模拟ADC体温" : "ct1711" : "无体温", "\n");
        int i28 = this.f24901v;
        p0.a.a(a10, "    体温算法:", i28 != 0 ? i28 != 1 ? i28 != 2 ? "--" : "JY体温定制算法" : "公版" : "未知", "\n");
        int i29 = this.f24902w;
        o.a(a10, "    体温硬件开关:", i29 != 0 ? i29 != 1 ? i29 != 2 ? "--" : "跟心率共用一个开关" : "带独立开关" : "否", "\n", "\n");
        a10.append("0x11 心电信息:\n");
        int i30 = this.f24903x;
        p0.a.a(a10, "    心电类型:", i30 != 0 ? i30 != 1 ? i30 != 2 ? i30 != 3 ? i30 != 4 ? "--" : "TI4900" : "TI1291" : "J心电" : "技通" : "无心电", "\n");
        int i31 = this.f24904y;
        if (i31 == 0) {
            str3 = "否";
        } else if (i31 == 1) {
            str3 = "带独立开关";
        } else if (i31 == 2) {
            str3 = "跟心率共用一个开关";
        }
        o.a(a10, "    心电硬件开关:", str3, "\n", "\n");
        a10.append("0x12 微信协议信息:\n");
        a10.append("    微信协议:");
        o.a(a10, this.f24905z ? "Y" : "N", "\n", "\n", "0x13 心率带协议信息:\n");
        a10.append("    心率带协议:");
        o.a(a10, this.A ? "Y" : "N", "\n", "\n", "0x14 重绑清数据信息:\n");
        a10.append("    重绑清数据:");
        o.a(a10, this.B ? "N" : "Y", "\n", "\n", "0x15 低电提醒信息:\n");
        a10.append("    低电提醒:");
        a10.append(this.C ? "Y" : "N");
        a10.append("\n");
        a10.append("\n");
        return a10.toString();
    }
}
