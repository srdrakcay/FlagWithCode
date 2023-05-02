package com.serdar.flagwithcode

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat


object FlagKit {
    private val countries = listOf(
        "AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AR", "AT", "AU", "AX", "AZ", "BA", "BB",
        "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BM", "BN", "BO", "BR", "BS", "BT", "BW", "BY",
        "BZ", "CA", "CAF", "CAS", "CD", "CEU", "CF", "CG", "CH", "CH", "CI", "CL", "CM", "CN",
        "CNA", "CO", "COC", "CR", "CSA", "CU", "CV", "CY", "CZ", "DE", "DJ", "DK", "DM", "DZ", "EC",
        "EE", "EG", "ER", "ES", "ET", "EU", "FI", "FJ", "FM", "FR", "GA", "GB", "GD", "GE", "GH",
        "GM", "GN", "GQ", "GR", "GT", "GW", "GY", "HK", "HN", "HR", "HT", "HU", "ID", "IE", "IL",
        "IN", "IQ", "IR", "IS", "IT", "JM", "JO", "JP", "KE", "KG", "KH", "KM", "KN", "KP", "KR",
        "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA",
        "MC", "MD", "ME", "MG", "MK", "ML", "MM", "MN", "MO", "MR", "MS", "MT", "MU", "MV", "MW",
        "MX", "MY", "MZ", "NA", "NE", "NG", "Nİ", "NL", "NO", "NP", "NZ", "OM", "PA", "PE", "PG",
        "PH", "PK", "PL", "PR", "PT", "PW", "PY", "QA", "RO", "RS", "RU", "RW", "SA", "SB", "SC",
        "SD", "SE", "SG", "SI", "SK", "SL", "SM", "SN", "SO", "SR", "ST", "SV", "SY", "SZ", "TC",
        "TD", "TG", "TH", "TJ", "TL", "TM", "TN", "TO", "TR", "TT", "TW", "TZ", "UA", "UG", "US",
        "UY", "UZ", "VC", "VE", "VG", "VN", "WS", "WW", "YE", "ZA", "ZW"
    )

    fun drawableWithFlag(context: Context, flagName: String?): Drawable? {
        val res = context.resources
        val resourceId = res.getIdentifier(flagName, "drawable", context.packageName)
        return ContextCompat.getDrawable(context,resourceId)
    }

    fun availableCountryCodes(): List<String> {
        return countries
    }
}