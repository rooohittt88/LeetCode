class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if (head == nullptr) {
            return nullptr;
        }

        int length = 0;
        ListNode* curr = head;
        while (curr != nullptr) {
            length++;
            curr = curr->next;
        }

        int targetIndex = length - n + 1;

        if (targetIndex == 1) {
            ListNode* temp = head;
            head = head->next;
            delete temp;
            return head; 
        }

        ListNode* temp = head;
  
        for (int i = 1; i < targetIndex - 1 && temp != nullptr; i++) {
            temp = temp->next;
        }

        if (temp == nullptr || temp->next == nullptr) {
            return head;
        }

        ListNode* toDelete = temp->next;
        temp->next = toDelete->next;
        delete toDelete;

        return head;
    }
};
