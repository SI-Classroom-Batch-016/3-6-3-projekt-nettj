package com.joxoo.outtrac.data.model

data class WorkLogSummary(
    val urn: String,
    val workedDayHours: Float,
    val workedWeekHours: Float,
    val workedMonthHours: Float,
    val todayHours: Float,
    val weekHours: Float,
    val monthHours: Float,
) {
}