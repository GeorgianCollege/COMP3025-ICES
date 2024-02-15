package ca.georgiancollege.comp3025_w2024_week6

/**
 * Creates an instance of the ContactModel Data Class
 *
 * @param FullName [String]
 * @param ContactNumber [String]
 * @param EmailAddress [String]
 */
data class ContactModel(
    val FullName: String,
    val ContactNumber: String,
    val EmailAddress: String
)
{
    /**
     * Overridden toString method
     */
    override fun toString(): String
    {
        return """Full Name: $FullName, Contact Number: $ContactNumber, Email Address: $EmailAddress """
    }

}
