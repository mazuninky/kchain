package xyz.mazuninky.blockchain

import xyz.mazuninky.kchain.Transaction

interface BlockchainService  {
    fun addTransaction(transaction: Transaction)
}
