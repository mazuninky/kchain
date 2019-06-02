package xyz.mazuninky.blockchain

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import xyz.mazuninky.kchain.Block
import xyz.mazuninky.kchain.Transaction

@RestController
class BlockchainController {
    @Autowired
    lateinit var blockchainService: BlockchainService

    @PostMapping("/transaction")
    fun sendTransaction(@RequestBody transaction: Transaction) {
        blockchainService.addTransaction(transaction)
    }
}
