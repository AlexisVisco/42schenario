## How to launch

`java -jar 42schenario.jar <text files>`

You can pass option with java: `-Dvalgrind=true`

## List of instructions

| Syntax        | Description  |        
| ------------- |-------------|
| #`<text>`| Comment |
| `<text>`%| Enter text without typing enter |
| >> import `<file path>` | Import a file in the current file|
| >> keys <list of keys to type with a `,`> | Execute combo keys |
| >> repeat `<number>` <list of keys to type with a `,`> | Repeating combo keys |
| >> setDelay `<number>` | Set the delay between each keys typed |
| >> setDelayEnter `<number>` | Set the delay between each text typed |
| >> `<text>` == `<text>` ? `<text>` : `<text>` | Check the condition equality between two first text and execute the ternary |
| >> `<text>` = `<text>`| Create a variable |
| >> wait `<number>` | Wait X milliseconds |
| >> print `<text>` | Print text |

## Keys available for `>> keys <list of keys to type with a ,>`

 * UP
 * DOWN
 * LEFT
 * RIGHT
 * CTRL
 * CMD
 * ALT
 * <- (like LEFT)
 * -> (like RIGHT)
 * TAB
 * ENTER
 * And all normal character