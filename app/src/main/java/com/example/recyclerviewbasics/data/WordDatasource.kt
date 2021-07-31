package com.example.recyclerviewbasics.data

// The source of data for the Word screen using a simple list of string
class WordDatasource {
    fun loadWords(): List<String> {
        return listOf(
            "Integrity",
            "Uprightness",
            "Ethics",
            "Morality",
            "Sincerity",
            "Truthfulness",
            "Trustworthiness",
            "Decency",
            "Virtue",
            "Fairness",
            "Honour",
            "Honesty",
            "Probity",
            "Principles",
            "Justice",
            "Equity",
            "Rectitude",
            "Righteousness"
        ).sorted()
    }
}