package com.yesI.codechallenges

class ETradeLinkedList {

    class Node(var data: Int) {
        var next: Node? = null
    }

    fun reverse(newNode: Node?): Node? {
        var node = newNode
        var prev: Node? = null
        var current = node
        var next: Node?

        while (current != null) {
            next = current.next
            current.next = prev
            prev = current
            current = next
        }

        node = prev

        return node
    }

    fun print(newNode: Node?) {
        var node = newNode
        while (node != null) {
            print(node.data.toString() + " ")
            node = node.next
        }
    }

    companion object {
        private var head: Node? = null

        @JvmStatic
        fun main(args: Array<String>) {
            val list = ETradeLinkedList()

            // Input: 10, 5, 6, 18, 8, 4

            head = Node(10)
            head!!.next = Node(5)
            head!!.next!!.next = Node(6)
            head!!.next!!.next!!.next = Node(18)
            head!!.next!!.next!!.next!!.next = Node(8)
            head!!.next!!.next!!.next!!.next!!.next = Node(4)

            println("Linked list")
            list.print(head)

            head = list.reverse(head)

            println("\n")
            println("Reversed Linked list ")
            list.print(head)
        }
    }
}