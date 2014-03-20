package com.offke.tradeunits.atoms.batch.param;

public class MealTime {
    private String breafasttime;//早餐时间
    private String lunchtime;//午餐时间
    private String dinnertime;//晚餐时间
    private String nighttime;//夜餐时间


    public MealTime() {
        this.breafasttime = "100000";
        this.lunchtime = "140000";
        this.dinnertime = "200000";
        this.nighttime = "235959";

    }

    public MealTime(String breafasttime,
                    String lunchtime,
                    String dinnertime,
                    String nighttime
    ) {
        this.breafasttime = breafasttime;
        this.lunchtime = lunchtime;
        this.dinnertime = dinnertime;
        this.nighttime = nighttime;
    }

    public String getBreafasttime() {
        return breafasttime;
    }

    public void setBreafasttime(String breafasttime) {
        this.breafasttime = breafasttime;
    }

    public String getLunchtime() {
        return lunchtime;
    }

    public void setLunchtime(String lunchtime) {
        this.lunchtime = lunchtime;
    }

    public String getDinnertime() {
        return dinnertime;
    }

    public void setDinnertime(String dinnertime) {
        this.dinnertime = dinnertime;
    }

    public String getNighttime() {
        return nighttime;
    }

    public void setNighttime(String nighttime) {
        this.nighttime = nighttime;
    }

}
