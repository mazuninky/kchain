package xyz.mazuninky.blockchain

import org.springframework.stereotype.Service
import xyz.mazuninky.kchain.Block
import xyz.mazuninky.kchain.Transaction

@Service
class BlockchainServiceImpl : BlockchainService {
    val chain: MutableList<Block> = mutableListOf()
    val currentTransactions: MutableList<Transaction> = mutableListOf()

    override fun addTransaction(transaction: Transaction) {
        currentTransactions.add(transaction)
    }
}
