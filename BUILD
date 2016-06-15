java_library(
	name='app',
	srcs=glob(['src/main/java/**']),
)

java_test(
	name='apptest',
	srcs=glob(['src/test/java/**']),
	test_class='com.redfin.AppTest',
	size="small",
	deps=['app', '@junit//jar', '@hamcrest_core//jar'],
)