package xyz.mazuninky.kchain

data class Block(val index: Long,
                 val timestamp: Long,
                 val prof: Long,
                 val previousHash: String,
                 val transactions: List<Transaction>)
