package lib3;

public enum KyHan {
    MOT_TUAN (0.005),
    MOT_THANG (0.045),
    MOT_NAM (0.068);
    final double lai_suat;

    KyHan(double lai_suat){
        this.lai_suat = lai_suat;
    }
}
