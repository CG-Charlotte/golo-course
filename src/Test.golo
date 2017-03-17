module test.UnitTest

local function assertEquals = |f, v| {
  require(f == v, v + " expected, got " + f)
}

function main = |args| {
  println("Starting test")
  assertEquals(sum(2,1),3)

  println("ok")
}
